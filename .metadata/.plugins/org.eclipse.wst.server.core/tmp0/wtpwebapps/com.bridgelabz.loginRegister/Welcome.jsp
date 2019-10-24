<%@page import="javax.swing.text.DefaultEditorKit.CutAction"%>
<%@page import="com.bridgelabz.loginRegister.Controller.Customer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%//session= request.getSession();
response.setHeader("Cache-Control", "no-cache, no-store, must-validate");//HTTP 1.1
response.setHeader("Pragma", "no-cache");//HTTP 1.0
response.setHeader("Expires", "0");//for proxy server

if(session.getAttribute("username")==null)//if user access this page without login
	{
		RequestDispatcher rd=request.getRequestDispatcher("/Login.jsp");
		rd.forward(request, response);
	}

out.println("logged in successfully!"); %>
<form action="Welcome" method="post">welcome ${username}....</form>
<table class="table" border="1" align="center">
	<thead>
		<tr>
			<th width="200" hight="100" scope="col">Name</th>
			<th width="200" hight="100" scope="col">email</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<Customer> customerList = (ArrayList<Customer>) request.getSession().getAttribute("List");//get userlist from listdao
			for (int i = 0; i < customerList.size(); i++) {//iterate that list
		%>
		<tr>
			<td>
				<%
					out.print(customerList.get(i).getName());
				%>
			</td>
			<td>
				<%
					out.print(customerList.get(i).getEmail());
				%>
			</td>

		</tr>
		<%
			}
		%>
	</tbody>
</table>
<form action="logout">
	<input type="submit" value="logout">
</form>



</body>
</html>