package common;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class JDBCConnection {
	
	private static Connection con;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String user = "root";
	private static String password = "root";
	
	private JDBCConnection() {
	}
	
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			con = (Connection) DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
}
