package jp.co.internous.provisioning.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import jp.co.internous.provisioning.dao.EditCompleteDAO;
import jp.co.internous.provisioning.dao.LoginAdminDAO;
import jp.co.internous.provisioning.dto.ReservationInfoDTO;

import com.opensymphony.xwork2.ActionSupport;
/**
 * EditCompleteAction 予約情報を削除するアクション
 * @author K.Mizuno
 * @since 2015/6/12
 * @version 1.0
 */
@SuppressWarnings("serial")
public class EditCompleteAction extends ActionSupport implements SessionAware{
	/**
	 * セッション
	 */
	private Map<String, Object> sessionMap;
	/**
	 * 削除番号
	 */
	private int editNumber;
	/**
	 * 予約情報リスト
	 */
	private List<ReservationInfoDTO> reservationList = new ArrayList<ReservationInfoDTO>();
	/**
	 * 実行メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return result
	 */
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
	/**
	 * セッション格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param editNumber
	 */
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	/**
	 * 削除番号取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return editNumber
	 */
	public int getEditNumber() {
		return editNumber;
	}
	/**
	 * 削除番号格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param editNumber
	 */
	public void setEditNumber(int editNumber) {
		this.editNumber = editNumber;
	}
	
}
