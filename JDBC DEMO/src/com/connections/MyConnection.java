package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnection {
	private static Connection con;
	public static Connection getMyConnection() {
		try {
//			Context initContext= new InitialContext();
//			Context envContext = (Context) initContext.lookup("java:comp/env");
//			DataSource ds = (DataSource) envContext.lookup("jdbc/TestDB");
//			con =ds.getConnection();
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa", "sa123");
			System.out.println("Connection success!");
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	}
	public static void closeMyConnection() {
		try {
			con.close();
				}
		
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
