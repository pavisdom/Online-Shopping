<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>||Login||</title>
<link href="css/Login.css" rel ="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<jsp:include page="/Header.jsp"></jsp:include>
	
    	<form class="login-content" action="LoginServlet" method="post">
      <div class="container">
        <label for="uname"><b>Email</b></label><br>
            <input id="input" type="text" placeholder="Enter E-mail" name="email" required><br>

        <label for="psw"><b>Password</b></label><br>
            <input id="input" type="password" placeholder="Enter Password" name="pwd" required><br>
            ${loginErr}
        
        <button class="button" type="submit">Login</button><br>
        <label>
            <input type="checkbox" checked="checked" name="remember"> Remember me<br>
        </label>
    </div>
  </form>
	</div>
</body>
</html>