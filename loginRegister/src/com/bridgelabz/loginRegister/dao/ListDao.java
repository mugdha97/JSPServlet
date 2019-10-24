package com.bridgelabz.loginRegister.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.loginRegister.Controller.Customer;

public class ListDao {

	public static List<Customer> getList() {

		List<Customer> cust = new ArrayList<Customer>();
		try {
			String query = "SELECT * FROM detail ";
			Connection con = null;
			Customer custObject = null;
			String url = "jdbc:mysql://localhost:3306/";
			String Db = "login";
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			con = DriverManager.getConnection(url + Db, "root", "password");//connection established...
			PreparedStatement ps = con.prepareStatement(query);// run the query
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				custObject = new Customer();
				custObject.setName(rs.getString(1));		//set the attributes in list
				custObject.setPassword(rs.getString(2));
				custObject.setEmail(rs.getString(3));
				cust.add(custObject);

			}
			System.out.println(cust);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		 return cust;
	}

}