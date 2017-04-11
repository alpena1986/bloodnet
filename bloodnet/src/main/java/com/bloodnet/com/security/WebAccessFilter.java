package com.bloodnet.com.security;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bloodnet.com.model.SystemUser;

/**
 * MySQL認証用に作成した独自フィルタです。
 */
@Scope("prototype")
@Component
public class WebAccessFilter extends AccessControlFilter {
	
	@Resource(name = "loggedInUser")
	public SystemUser loggedInUser;
	
    private final static String unauthorizedUrl = "/5";  
    private final static String loginUrl = "/login";  
    
	public WebAccessFilter() {
		super();
	}

	/**
	 * アクセス許可時の処理 カスタマイズ用の認証処理です。
	 * 
	 * @param req
	 *            リクエスト情報
	 * @param rsp
	 *            レスポンス情報
	 * @param obj
	 *            付加情報
	 * @throws Exception
	 *             例外
	 * @return boolean true:アクセス許可
	 */
	@Override
	protected boolean isAccessAllowed(final ServletRequest req, final ServletResponse rsp, final Object obj) throws Exception {

		if(StringUtils.hasLength(loggedInUser.getAcid())) {
			return true;
		}
		return false;
	}

	/**
	 * アクセス拒否時の処理
	 * 
	 * @param req
	 *            リクエスト情報
	 * @param rsp
	 *            レスポンス情報
	 * @throws Exception
	 *             例外
	 * @return boolean false:アクセス許拒否
	 */
	@Override
	protected boolean onAccessDenied(final ServletRequest request, final ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);  
        if (subject.getPrincipal() == null) {//表示没有登录，重定向到登录页面  
            saveRequest(request);  
            WebUtils.issueRedirect(request, response, loginUrl);  
        } else {  
            if (StringUtils.hasText(unauthorizedUrl)) {//如果有未授权页面跳转过去  
                WebUtils.issueRedirect(request, response, unauthorizedUrl);  
            } else {//否则返回401未授权状态码  
                WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED);  
            }  
        }  
        return false; 
	}
}