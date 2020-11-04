<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Menu List</title>
</head>
<body>
	<spr:form action="addmenu_form.htm" method="post" commandName="admin">
	<table align="center">
	  <tr><td> <h2>Welcome To HotelOne</h2></td></tr>
		<tr>
			<td>Dish Name</td><td><spr:input path="dishName"/></td>
		</tr>
		<tr>
			<td>quantity</td><td><spr:input path="qty"/></td>
		</tr>
		<tr>
			<td>price</td><td><spr:input path="price"/></td>
		</tr>
		<tr>
			<td></td>
		</tr>

			<td><a href="admin_home.jsp">Back</a></td>
			<td><input type="submit" value="ADD Menu"></td>
		</tr>
		</table>
		</spr:form>
</body>
</html>