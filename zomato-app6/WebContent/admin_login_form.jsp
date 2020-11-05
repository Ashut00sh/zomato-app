<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Page</title>
<link href="https://unpkg.com/browse/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>

<body>
	<spr:form action="a_login_admin.htm" method="post" commandName="admin">
	<table align="center" class="form-control">
		<tr>
			<td><h1>Admin Login Here</h1></td>
		</tr>
		<tr>
			<td> </td>
		</tr>
		<tr>
			<td>userName</td><td><spr:input path="userName"/>
			<font color="red">
			<spr:errors path="userName"></spr:errors></td>
			</font>
		</tr>
		<tr>
			<td>Password</td><td><spr:password path="userPass"/>
			<font color="red">
			<spr:errors path="userPass"></spr:errors></td>
			</font>
		</tr>
		<tr> 
		<tr>
			<td><a href="index.jsp">Back</a></td>
			<td><input type="submit" value="Login admin"></td>
		</tr>
		<tr>
			<td><a href="forgot_password.html">Forget PassWord</a></td>
		</tr>
		<form>
  
		</table>
		</spr:form>
</body>
</html>