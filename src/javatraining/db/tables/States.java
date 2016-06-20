package javatraining.db.tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

public class States {
	public static void displayData(ResultSet rs) throws SQLException {
		while(rs.next()) {
			String stateFullName =
					rs.getString("stateId") + ": " + rs.getString("stateName");
			System.out.println(stateFullName);
		}
	}

}
