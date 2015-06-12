/**
 * 
 */
package jp.co.internous.Ucycle.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import jp.co.internous.Ucycle.DAO.LoginAdminDAO;
import jp.co.internous.Ucycle.DTO.ReservationInfoDTO;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Alice_DaArc
 *
 */
public class LoginAdminAction extends ActionSupport implements SessionAware{
	private int adminId;
	private String adminPassword;
	private Map<String, Object> sessionMap;
	private List<ReservationInfoDTO> reservationList;
	private int portId;
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
	 * @return adminId
	 */
	public int getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId セットする adminId
	 */
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return adminPassword
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * @param adminPassword セットする adminPassword
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	/**
	 * セッション情報を格納するsetter
	 */
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	
}
