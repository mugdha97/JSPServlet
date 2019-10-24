package com.bridgelabz.loginRegister.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	String sql="insert into detail values(?,?,?)";
	public void checkUser(String uname,String password,String mail) throws SQLException
	{
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "login";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);  
			con = DriverManager.getConnection(url + db, "root", "password");
			PreparedStatement ps=con.prepareStatement(sql);  
					ps.setString(1,uname);  
					ps.setString(2,password); 
					ps.setString(3,mail);
					ps.executeUpdate();
					System.out.println("New User register successfully....");
			}catch(Exception e) {
				
			}
		finally{
			con.close();
		}
		
	}
}
