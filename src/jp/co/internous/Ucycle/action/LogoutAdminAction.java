package jp.co.internous.Ucycle.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAdminAction extends ActionSupport implements SessionAware{
	private Map<String, Object> sessionMap;
	public String execute() {
		System.out.println("session:" + sessionMap);
		sessionMap.clear();
		System.out.println("session:" + sessionMap);
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

}
