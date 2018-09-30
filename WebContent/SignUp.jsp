<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import = "online_shopping_store.categories" %>
<%@ page import = "java.util.ArrayList" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>::Sliit Store::| Sign in</title>
    <link href="css/style.css" rel ="stylesheet" type="text/css">
    </head>
<body>
    <div id="wrapper">
    <jsp:include page="/Header.jsp"></jsp:include>
    <div id="login-title">
    <h1>Sign Up</h1>
    <h2>welcome to the online store</h2>
    <form action="SignUpServlet" method="post">
            <span>Name:     <input type="text" name="cName">  </span><br>
            <span>Address:  <input type="text" name="cAddress"></span><br>
            <span>E-mail:   <input type="text" name="cemail">${email}</span><br>
            <span>password: <input type="password" name="cPassword"></span><br>
            <span>Re-enter Password: <input type="text" name="crPassword">${pwd}</span><br>
            <span>Attach image: <input type="text" name="ciURL"></span>
            <span><input type="submit" value="Create Account">  </span>
            <h1>${name}</h1>
        </form>
    </div>
    </div>
    
    </body>
</html>