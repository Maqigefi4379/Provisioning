package jp.co.internous.provisioning.dto;
/**
 * ReservationInfoDTO 顧客情報を格納するクラス
 * @author K.Mizuno
 * @since 2015/6/12
 *　
 */
public class ReservationInfoDTO {
	private int customerId;
	private String portName;
	private int cycleId;
	private int plan;
	private String reservationDate;
	/**
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId セットする customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return portName
	 */
	public String getPortName() {
		return portName;
	}
	/**
	 * @param portName セットする portName
	 */
	public void setPortName(String portName) {
		this.portName = portName;
	}
	/**
	 * @return cycleId
	 */
	public int getCycleId() {
		return cycleId;
	}
	/**
	 * @param cycleId セットする cycleId
	 */
	public void setCycleId(int cycleId) {
		this.cycleId = cycleId;
	}
	/**
	 * @return plan
	 */
	public int getPlan() {
		return plan;
	}
	/**
	 * @param plan セットする plan
	 */
	public void setPlan(int plan) {
		this.plan = plan;
	}
	/**
	 * @return reservationDate
	 */
	public String getReservationDate() {
		return reservationDate;
	}
	/**
	 * @param reservationDate セットする reservationDate
	 */
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
}
