/**
 * 
 */
package jp.co.internous.provisioning.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import jp.co.internous.provisioning.dao.LoginAdminDAO;
import jp.co.internous.provisioning.dto.ReservationInfoDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * LoginAdminAction 管理者画面にログインするアクション
 * @author K.Mizuno
 * @since 2015/6/12
 * @version 1.0
 */
@SuppressWarnings("serial")
public class LoginAdminAction extends ActionSupport implements SessionAware{
	/**
	 * 管理者ID
	 */
	private int adminId;
	/**
	 * 管理者パスワード
	 */
	private String adminPassword;
	/**
	 * セッション
	 */
	private Map<String, Object> sessionMap;
	/**
	 * リスト
	 */
	private List<ReservationInfoDTO> reservationList;
	/**
	 * 駐輪場ID
	 */
	private int portId;
	/**
	 * 実行メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return result
	 */
	public String execute(){
		System.out.println(adminId);
		String result = ERROR;
		LoginAdminDAO dao =new LoginAdminDAO();
		if (dao.select(adminId, adminPassword)){
			result = SUCCESS;
			portId = dao.getPortId();
			reservationList = dao.ThreeNil(portId);
		}
		sessionMap.put("reservationList", reservationList);
		sessionMap.put("portId", portId);
		return result;
	}

	/**
	 * 管理者ID取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return adminId
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * 管理者ID格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param adminId
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * 管理者パスワード取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return adminPassword
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * 管理者パスワード格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param adminPassword
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
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
