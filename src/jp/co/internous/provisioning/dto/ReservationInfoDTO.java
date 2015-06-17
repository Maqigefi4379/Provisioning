package jp.co.internous.provisioning.dto;
/**
 * ReservationInfoDTO 顧客情報を格納するクラス
 * @author K.Mizuno
 * @since 2015/6/12
 * @version 1.0
 */
public class ReservationInfoDTO {
	/**
	 * 会員ID
	 */
	private int customerId;
	/**
	 * 駐輪場名
	 */
	private String portName;
	/**
	 * 自転車ID
	 */
	private int cycleId;
	/**
	 * 利用時間プラン
	 */
	private int plan;
	/**
	 * 利用日時
	 */
	private String reservationDate;
	/**
	 * 会員取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * 会員ID格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * 駐輪場名取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return portName
	 */
	public String getPortName() {
		return portName;
	}
	/**
	 * 駐輪場名格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param portName
	 */
	public void setPortName(String portName) {
		this.portName = portName;
	}
	/**
	 * 自転車ID取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return cycleId
	 */
	public int getCycleId() {
		return cycleId;
	}
	/**
	 * 自転車ID格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param cycleId
	 */
	public void setCycleId(int cycleId) {
		this.cycleId = cycleId;
	}
	/**
	 * 利用時間プラン取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return plan
	 */
	public int getPlan() {
		return plan;
	}
	/**
	 * 利用時間プラン格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param plan
	 */
	public void setPlan(int plan) {
		this.plan = plan;
	}
	/**
	 * 利用日時取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return reservationDate
	 */
	public String getReservationDate() {
		return reservationDate;
	}
	/**
	 * 利用日時格納メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param reservationDate
	 */
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
}
