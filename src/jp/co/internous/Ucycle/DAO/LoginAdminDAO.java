/**
 * 
 */
package jp.co.internous.Ucycle.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.internous.Ucycle.DTO.ReservationInfoDTO;


/**
 * @author Alice_DaArc
 *
 */
public class LoginAdminDAO {
	private boolean res;
	private java.sql.Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	private int portId;

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
	
	public List<ReservationInfoDTO> ThreeNil(int portId2){
		String portName = null;
		List<ReservationInfoDTO> reservationList = new ArrayList<ReservationInfoDTO>();
		
		con = DBconnector.getConnection();
		sql = "SELECT * FROM port WHERE port_id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, portId2);
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
	 * @return portId
	 */
	public int getPortId() {
		return portId;
	}
}
