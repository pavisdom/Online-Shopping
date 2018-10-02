<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "online_shopping_store.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
    <link href="css/profile.css" rel ="stylesheet" type="text/css">

</head>
<body>

<div id="wrapper">    	
	<jsp:include page="/Header.jsp"></jsp:include>
	<div id = "profile-content">
            <div class="image-con"><img src = "${imgURL}"> <br>
                </div>
            <div class = "profile-details">
                <h1>${cName}</h1>
                <table class="details-table">
                    <tr>
                        <td>Email</td>
                        <td>${email}</td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td>${address}</td>
                    </tr>
                </table>
            </div>
        </div>

            
    </div>
</body>
</html>