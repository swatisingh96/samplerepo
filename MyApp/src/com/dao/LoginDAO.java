package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.connections.MyConnection;

public class LoginDAO {
	public boolean checkLogin(String username, String password) {
		boolean success= false;
		Connection con = MyConnection.getMyConnection();
		String CHECK_LOGIN = "SELECT USERNAME, PASSWORD FROM LOGIN WHERE USERNAME=? AND PASSWORD=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(CHECK_LOGIN);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet set = ps.executeQuery();
			if(set.next()) {
				success=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return success;
		
	}
}
