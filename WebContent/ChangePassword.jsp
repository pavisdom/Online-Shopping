<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<header>
    <title>Edit Profile</title>
    <link href="css/profile.css" rel ="stylesheet" type="text/css">
    </header>
<body>
    <div id="wrapper">
        <div id = "profile-content">
            <div class="image-con"><img src = "WEB-IMG/avatar.png"> <br>
                </div>
            <div class = "profile-details">
                <h1>Edit Password</h1>
                <form action="changePwdServlet" method="post">
                <table class="details-table">
                    
                    <tr>
                        <td>Current Password</td>
                        <td><input type="password" name="cPassword" placeholder="**********" required>${wrongpwd}</td>
                    </tr>
                    <tr>
                        <td>New Password</td>
                        <td><input type="password" name="nPassword" placeholder="**********" required></td>
                    </tr>
                    <tr>
                        <td>Confirm new Password</td>
                        <td><input type="password" name="cnPassword" placeholder="**********" required>${notmatch}</td>
                    </tr>
                </table>
                    <input id = "submit-btn" type="submit" value="Save Password">
                </form>
            </div>
            
        </div>
    
    </div>
</body>
</html>