package com.bridgelabz.loginRegister.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginRegister.dao.ConnectionDao;
import com.bridgelabz.loginRegister.dao.RegisterDao;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		String mail=request.getParameter("mail");
		ConnectionDao login=new ConnectionDao();
		RegisterDao register=new RegisterDao();
		try {
			if(login.checkUser(uname, password))
			{
			System.out.println("User already registered");
			response.sendRedirect("login.jsp");
			}
			else
			{	if(uname!=null&&password!=null&&mail!=null) {
				HttpSession session=request.getSession();//create session 
				register.checkUser(uname, password,mail);
				response.sendRedirect("Login.jsp");
			}
			else
				System.out.println("Invalid credentials");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
