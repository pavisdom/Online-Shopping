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
                <h1>Edit Profile Details</h1>
                <form action="saveChangesServlet" method="post">
                <table class="details-table">
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="cName" value="${cName}" required></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="cAddress" value="${address}" required></td>
                    </tr>
                    
                </table>
                    <input id = "submit-btn" type="submit" value="Save Changes">
                    
                </form>
                <a href ="ChangePassword.jsp">Change password</a>
            </div>
            
        </div>
    
    </div>
</body>
</html>