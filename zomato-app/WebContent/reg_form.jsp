<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<spr:form action="reg.htm" method="post" commandName="user">
	<table align="center">
		<tr>
			<td>userName</td><td><spr:input path="userName"/></td>
		</tr>
		<tr>
			<td>Password</td><td><spr:input path="userPass"/></td>
		</tr>
		<tr>
			<td>Email</td><td><spr:input path="email"/></td>
		</tr>
		<tr>
			<td>Phone Number</td><td><spr:input path="phone"/></td>
		</tr>
		<tr>
			<td>Address</td><td><spr:input path="address"/></td>
		</tr>
		<tr>
			<td><a href="index.jsp">Back</a></td>
			<td><input type="submit" value="Register"></td>
		</tr>
		</table>
		</spr:form>
</body>
</html>