<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css"> <!-- add css files -->
</head>
<body>
<center>
<div class="container">
<form action="Register" method="post">
		<div><h1> REGISTRATION FORM</h1></div>
      <label for="uname"><b>Username : </b></label>
      <input type="text" placeholder="Enter Username" name="uname" required><br>

      <label for="psw"><b>Password : </b></label>
      <input type="password" placeholder="Enter Password" name="password" required><br>

	  <label for="mail"><b>Email : </b></label>
	  <input type="text" placeholder="Enter Email" name="mail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" required><br>
    
      <button type="submit"value="Register">Register</button>
<!--      <input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"> -->
     </form>
    </div>
    
    </center>
</body>
</html>