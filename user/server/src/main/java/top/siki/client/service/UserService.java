package top.siki.client.service;


import top.siki.client.dataobject.UserInfo;

/**
 * 2018-03-04 21:44
 * @author wiki
 */
public interface UserService {

	/**
	 * 通过openid来查询用户信息
	 * @param openid
	 * @return
	 */
	UserInfo findByOpenid(String openid);
}
