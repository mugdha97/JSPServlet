<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="login.css"> <!-- add css files -->
</head>
<body>
<center>

<div class="container">
<form action="login" method="post">
		<div><h1> LOGIN FORM</h1></div>
      <label for="uname"><b>Username : </b></label>
      <input type="text" placeholder="Enter Username" name="uname" required><br>

      <label for="psw"><b>Password : </b></label>
      <input type="password" placeholder="Enter Password" name="password" required><br>

      <button type="submit"value="login">Login</button>
     <a href="Registration.jsp">new user??</a>
     </form>
    </div>
    
    </center>
</body>
</html>