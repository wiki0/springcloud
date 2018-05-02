package top.siki.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.siki.client.dataobject.UserInfo;

/**
 * 2018-03-04 21:42
 * @author wiki
 */
public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {

	UserInfo findByOpenid(String openid);
}
