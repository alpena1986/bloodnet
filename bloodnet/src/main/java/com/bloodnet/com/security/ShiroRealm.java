package com.bloodnet.com.security;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bloodnet.com.model.SystemUser;
import com.bloodnet.services.SessionService;

@Scope("prototype")
@Component
public class ShiroRealm extends AuthorizingRealm {

	@Autowired
	public DataSource dataSource;
	
	@Autowired
	public SessionService sessionService;
	
	@Resource(name="loggedInUser")
	public SystemUser loggedInUser;

	/**
	 * 認証処理
	 * @param token 認証トークン
	 * @return AuthenticationInfo
	 * @throws AuthenticationException Apache Shiroからの例外
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(final AuthenticationToken token) throws AuthenticationException {

	    final UsernamePasswordToken upToken = (UsernamePasswordToken) token;
	    final String userName = upToken.getUsername();

	    String acid = sessionService.getSessionId(upToken.getUsername(), String.valueOf(upToken.getPassword()));
	    
	    if (StringUtils.isBlank(acid)) {
	    	return null;
	    } else {
	    	loggedInUser.setSessionId(acid);
	    }
	    
	    //Sha256CredentialsMatcher credentialsMatcher = new Sha256CredentialsMatcher();
	    //super.setCredentialsMatcher(credentialsMatcher);
	    //credentialsMatcher.setHashIterations(1);

	    //パスワードが改ざんされていないかをチェック
	    //final Sha256Hash credentials = Sha256Hash.fromBase64String(user.getPassword());
	    //credentials.setSalt(ByteSource.Util.bytes(Base64.decode(user.getSalt())));

	    final SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName, upToken.getPassword(), getName());
	    //info.setCredentialsSalt(credentials.getSalt());

	    return info;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

}