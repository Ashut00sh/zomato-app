<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<spr:form action="login.htm" method="post" commandName="user">
	<table align="center">
		<tr>
			<td><h1>Login Here</h1></td>
		</tr>
			<tr>
			<td> </td>
		</tr>
		<tr>
			<td>userName</td><td><spr:input path="userName"/></td>
		</tr>
		<tr>
			<td>Password</td><td><spr:password path="userPass"/></td>
		</tr>
		<tr>
		<tr>
			<td><a href="index.jsp">Back</a></td>
			<td><input type="submit" value="Login"></td>
		</tr>
		</table>
		</spr:form>
</body>
</html>