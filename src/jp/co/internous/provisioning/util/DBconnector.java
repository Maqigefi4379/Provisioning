package jp.co.internous.provisioning.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * DBconnecto DB接続を管理するクラス
 * @author K.Mizuno
 * @since 2015/6/11
 * @version 1.0
 */
public class DBconnector {
	/**
	 *ドライバー名
	 */
    private static String driverName = "com.mysql.jdbc.Driver";
    /**
     * url名
     */
    private static String url = "jdbc:mysql://localhost/ucycle";
	/**
	 *ユーザー名
	 */
    private static String user = "root";
	/**
	 *パスワード
	 */
    private static String pass = "mysql";
    /**
     * DBconnector DBから情報を取得するメソッド
     * @author K.Mizuno
     * @since 2015/06/12
     * @throws ClassNotFoundException
     * @throws SQLException
     * @return con
     */
    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}