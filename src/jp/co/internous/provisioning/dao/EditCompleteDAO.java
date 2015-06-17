package jp.co.internous.provisioning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.co.internous.provisioning.util.DBconnector;
/**
 * EditCompleteDAO 予約情報を削除するクラス
 * @author K.Mizuno
 * @since 2015/6/12
 */
public class EditCompleteDAO {
	/**
	 * 自転車IDを元に予約情報を削除する
	 * @author K.Mizuno
	 * @since 2015/6/12
	 * @param editNumber
	 * @return res
	 */
	public boolean update(int editNumber){
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
