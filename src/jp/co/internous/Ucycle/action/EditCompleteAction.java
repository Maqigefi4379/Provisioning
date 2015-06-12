package jp.co.internous.Ucycle.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import jp.co.internous.Ucycle.DAO.EditCompleteDAO;
import jp.co.internous.Ucycle.DAO.LoginAdminDAO;
import jp.co.internous.Ucycle.DTO.ReservationInfoDTO;

import com.opensymphony.xwork2.ActionSupport;

public class EditCompleteAction extends ActionSupport implements SessionAware{
	private Map<String, Object> sessionMap;
	private int editNumber;
	private List<ReservationInfoDTO> reservationList = new ArrayList<ReservationInfoDTO>();
	public String execute(){
		String result = ERROR;
		EditCompleteDAO editDao = new EditCompleteDAO();
		if(editDao.update(editNumber)){
			result = SUCCESS;
			LoginAdminDAO loginDao = new LoginAdminDAO();
			reservationList = loginDao.ThreeNil((int)sessionMap.get("portId"));
			sessionMap.put("reservationList", reservationList);
		}
		return result;
	}
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	/**
	 * @return editNumber
	 */
	public int getEditNumber() {
		return editNumber;
	}
	/**
	 * @param editNumber セットする editNumber
	 */
	public void setEditNumber(int editNumber) {
		this.editNumber = editNumber;
	}
	
}
