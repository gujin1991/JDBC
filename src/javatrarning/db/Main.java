package javatrarning.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javatraining.db.beans.Admin;
import javatraining.db.tables.*;
import javatraining.db.util.InputHelper;

public class Main {	
	
	
	public static void main(String[] args) throws Exception {
		AdminManager.displayAllRows();
				
		int adminId = InputHelper.getIntegerInput("Select a row to delect: ");
		
		
		
		if (AdminManager.delect(adminId)) {
			System.out.println("Success!");
		} else
		{
			System.err.println("whoops!");
		
				
		}
	}

}
