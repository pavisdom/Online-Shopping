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
    <link href="css/signup.css" rel ="stylesheet" type="text/css">
    </head>
<body>
    <div id="wrapper">
    <jsp:include page="/Header.jsp"></jsp:include>
     <div id="login-title">
    <h1>Sign Up</h1>
    <h2>welcome to the online store</h2>
        <br><br>
            </div>

    <div id="login-form">
        <form action="SignUpServlet" method="post">
            <table class="login-table">
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="cName" placeholder="Frank Abagnale" required></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="cAddress" placeholder=" No. 69  Benson Park Drive, Washington, D.C." required></td>
                </tr>
                <tr>
                    <td>E-mail${email}</td>
                    <td><input type="text" name="cemail" placeholder="frank123@mail.com" required></td>
                </tr><tr>
                    <td>Password</td>
                    <td><input type="password" name="cPassword" placeholder="**********" required></td>
                </tr><tr>
                    <td>Password confirmation${pwd}</td>
                    <td><input type="password" name="crPassword" placeholder="**********" required></td>
                </tr><tr>
                    <td>Attach your picture</td>
                    <td><input type="file"  name="ciURL"></td>
                </tr><tr>
                    <td></td>
                    
                </tr>
            </table>
             <input id = "submit-btn" type="submit" value="Create Account">
           
        <!--    <span>Name:     <input type="text" name="cName">  </span><br>
            <span>Address:  <input type="text" name="cAddress"></span><br>
            <span>E-mail:   <input type="text" name="cemail"></span><br>
            <span>password: <input type="password" name="cPassword"></span><br>
            <span>Re-enter Password: <input type="text" name="crPassword"></span><br>
            <span>Attach image: <input type="text" name="ciURL"></span>-->
        </form>
        
        </div>
    </div>
    
    </body>
</html>