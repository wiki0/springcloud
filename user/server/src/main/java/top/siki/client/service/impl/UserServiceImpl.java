package top.siki.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.siki.client.dataobject.UserInfo;
import top.siki.client.repository.UserInfoRepostory;
import top.siki.client.service.UserService;

/**
 * 2018-03-04 21:45
 * @author wiki
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoRepostory repostory;
	/**
	 * 通过openid来查询用户信息
	 *
	 * @param openid
	 * @return
	 */
	@Override
	public UserInfo findByOpenid(String openid) {
		return repostory.findByOpenid(openid);
	}
}
