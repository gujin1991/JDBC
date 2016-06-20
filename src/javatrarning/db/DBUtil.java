package javatrarning.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private final static String USERNAME = "dbuser";
	private final static String PASSWORD = "dbpassword";
	private final static String M_CONN_STRING =
			"jdbc:mysql://localhost/explorecalifornia";
	private final static String H_CONN_STRING =
			"jdbc:hsqldb:data/explorecalifornia";
	
	public static Connection getConnection(DBType dbtype) throws SQLException {
		switch (dbtype) {
			case MYSQL:
				return DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
			case HSQLDB:
				return DriverManager.getConnection(H_CONN_STRING, USERNAME, PASSWORD);
			default:
				return null;
		}
	}
	
	public static void processException(SQLException e) {
		System.err.println("Error message: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
		System.err.println("SQL state: " + e.getSQLState());
	}
}
