package jp.co.internous.provisioning.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * LogoutAdminAction ログアウトし管理者ログイン画面に遷移するアクション
 * @author K.Mizuno
 * @since 2015/6/12
 * @version 1.0
 */
@SuppressWarnings("serial")
public class LogoutAdminAction extends ActionSupport implements SessionAware{
	/**
	 * セッション
	 */
	private Map<String, Object> sessionMap;
	/**
	 * 実行メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return SUCCESS
	 */
	public String execute() {
		sessionMap.clear();
		return SUCCESS;
	}
	/**
	 * セッション格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		
		this.sessionMap = session;
	}

}
