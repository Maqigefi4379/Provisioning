package jp.co.internous.Ucycle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditCompleteDAO {
	public boolean update(int editNumber){
		System.out.println(editNumber);
		String sql = "DELETE FROM reservation_info WHERE cycle_id = ?";
		boolean res = false;
		Connection con = DBconnector.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, editNumber);
			int i = ps.executeUpdate();
			if(i > 0){
				res = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
