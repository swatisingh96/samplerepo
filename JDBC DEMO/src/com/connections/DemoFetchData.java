package com.connections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoFetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = MyConnection.getMyConnection();
		//System.out.println(con);
		String FIND_ALL_EMPLOYEES = "SELECT * FROM EMP";
		

		try {
			
			Statement  st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet set =st.executeQuery(FIND_ALL_EMPLOYEES);
			DatabaseMetaData metadata= con.getMetaData();
			System.out.println(metadata.getDatabaseProductName());
			
			ResultSetMetaData resultSetMetaData= set.getMetaData();
			System.out.println("no. of cols:-");
		/*	while(set.next()) {
				
				int empID =  set.getInt(1);
				String name= set.getString(2);
				int salary= set.getInt(3);
	//			System.out.println(empID+" "+salary);
			}*/		
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
