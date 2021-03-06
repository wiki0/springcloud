package top.siki.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.siki.client.constant.CookieConstant;
import top.siki.client.constant.RedisConstant;
import top.siki.client.dataobject.UserInfo;
import top.siki.client.enums.ResultEnum;
import top.siki.client.enums.RoleEnum;
import top.siki.client.service.UserService;
import top.siki.client.utils.ResultClientUtil;
import top.siki.commons.model.ResponseResult;
import top.siki.commons.utils.CookieUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 2018-03-04 23:12
 * @author wiki
 */
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	/**
	 * 买家登录
	 * @param openid
	 * @param response
	 * @return
	 */
	@GetMapping("/buyer")
	public ResponseResult buyer(@RequestParam("openid") String openid,
								HttpServletResponse response) {
		//1. openid和数据库里的数据是否匹配
		UserInfo userInfo = userService.findByOpenid(openid);
		if (userInfo == null) {
			return ResultClientUtil.error(ResultEnum.LOGIN_FAIL);
		}

		//2. 判断角色
		if (!RoleEnum.BUYER.getCode().equals(userInfo.getRole())) {
			return ResultClientUtil.error(ResultEnum.ROLE_ERROR);
		}

		//3. cookie里设置openid=abc
		CookieUtil.set(response, CookieConstant.OPENID, openid, CookieConstant.expire);

		return ResultClientUtil.success();
	}

	@GetMapping("/seller")
	public ResponseResult seller(@RequestParam("openid") String openid,
						  HttpServletRequest request,
						  HttpServletResponse response) {
		//判断是否已登录
		Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
		if (cookie != null &&
				!StringUtils.isEmpty(stringRedisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_TEMPLATE, cookie.getValue())))) {
			return ResultClientUtil.success();
		}

		//1. openid和数据库里的数据是否匹配
		UserInfo userInfo = userService.findByOpenid(openid);
		if (userInfo == null) {
			return ResultClientUtil.error(ResultEnum.LOGIN_FAIL);
		}

		//2. 判断角色
		if (!RoleEnum.SELLER.getCode().equals(userInfo.getRole())) {
			return ResultClientUtil.error(ResultEnum.ROLE_ERROR);
		}

		//3. redis设置key=UUID, value=xyz
		String token = UUID.randomUUID().toString();
		Integer expire = CookieConstant.expire;
		stringRedisTemplate.opsForValue().set(String.format(RedisConstant.TOKEN_TEMPLATE, token),
				openid,
				expire,
				TimeUnit.SECONDS);

		//4. cookie里设置token=UUID
		CookieUtil.set(response, CookieConstant.TOKEN, token, CookieConstant.expire);

		return ResultClientUtil.success();
	}


}
