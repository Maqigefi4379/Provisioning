package jp.co.internous.provisioning.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.provisioning.dto.ReservationInfoDTO;
import jp.co.internous.provisioning.util.DBconnector;
/**
 * LoginAdminDAO AdminLoginActionがDBに接続するためのDAOクラス
 * @author K.Mizuno
 * @since 2015/6/11
 * @version 1.0
 */
public class LoginAdminDAO {
	/**
	 * 例外処理に入らなければtrueを返す
	 */
	private boolean res;
	/**
	 * コネクション
	 */
	private java.sql.Connection con;
	/**
	 * sql
	 */
	private String sql;
	/**
	 * 文字列をsql文として格納
	 */
	private PreparedStatement ps;
	/**
	 * 結果を格納
	 */
	private ResultSet rs;
	/**
	 * 駐輪場ID
	 */
	private int portId;
	/**
	 * 管理者情報を取得するメソッド
	 * @author K.Mizuno
	 * @since 2015/6/11
	 * @param adminId
	 * @param adminPassword
	 * @return　result
	 */
	public boolean select(int adminId, String adminPassword){
		res =false;
		con = DBconnector.getConnection();
		sql = "SELECT * FROM admin WHERE admin_id = ? AND admin_password = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, adminId);
			ps.setString(2, adminPassword);
			rs = ps.executeQuery();
			while(rs.next()){
				portId = rs.getInt(3);
				res = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return res;
	}
	/**
	 * 予約情報を取得するメソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param portId
	 * @return reservationList
	 */
	public List<ReservationInfoDTO> select(int portId){
		String portName = null;
		List<ReservationInfoDTO> reservationList = new ArrayList<ReservationInfoDTO>();
		
		con = DBconnector.getConnection();
		sql = "SELECT * FROM port WHERE port_id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, portId);
			rs = ps.executeQuery();
			while(rs.next()){
				portName = rs.getString(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		sql = "SELECT * FROM reservation_info WHERE port_name = ?";
		con = DBconnector.getConnection();
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, portName);
			rs = ps.executeQuery();
			while(rs.next()){
				ReservationInfoDTO dto = new ReservationInfoDTO();
				dto.setCustomerId(rs.getInt(1));
				dto.setPortName(rs.getString(2));
				dto.setCycleId(rs.getInt(3));
				dto.setPlan(rs.getInt(4));
				dto.setReservationDate(rs.getString(5));
				reservationList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return reservationList;
	}

	/**
	 * 駐輪場IDを取得メソッド
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @return portId
	 */
	public int getPortId() {
		return portId;
	}
}
