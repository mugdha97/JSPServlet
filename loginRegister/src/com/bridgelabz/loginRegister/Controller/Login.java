package com.bridgelabz.loginRegister.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginRegister.dao.ConnectionDao;
import com.bridgelabz.loginRegister.dao.ListDao;

@WebServlet("/login")
public class Login extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		ConnectionDao login = new ConnectionDao();
		try {
			if (login.checkUser(uname, password)) {
				List<Customer> list = ListDao.getList();
				HttpSession session = request.getSession();
				session.setAttribute("List", list);
				session.setAttribute("username", uname);// set session attribute
				request.getRequestDispatcher("Welcome.jsp").forward(request, response);

			} else {
				response.sendRedirect("Registration.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
