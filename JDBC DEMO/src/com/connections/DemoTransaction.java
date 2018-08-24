package com.connections;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub = con
		Connection con= null;
		try {
			
			con=  MyConnection.getMyConnection();
			con.setAutoCommit(false);
		//	System.out.println("connection successful");
			Statement st = con.createStatement();
			st.executeUpdate("insert into emp values(910,'City',100000)");
			st.executeUpdate("insert into emp values(920,'City',100000)");
			st.executeUpdate("insert into emp values(100,'City',100000)");
			st.executeUpdate("insert into emp values(930,'City',100000)");
		
			con.commit();
		}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
			
		}
		
	}

}
