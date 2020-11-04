<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Admin Menu List Form</title>
</head>
<body>
	<spr:form action="a_menu_update.htm" method="post" commandName="menu">
	<table align="center">
	<tr>
			<td></td><td><spr:hidden path="dishId"/></td>
		</tr>
		<tr>
			<td>Dish Name</td><td><spr:input path="dishName"/></td>
		</tr>
		<tr>
			<td>quantity</td><td><spr:input path="qty"/></td>
		</tr>
		<tr>
			<td>Price</td><td><spr:input path="price"/></td>
		</tr>
		<tr>
			<td></td>
		</tr>

			<td><a href="menu_list.htm">Back</a></td>
			<td><input type="submit" value="Update"></td>
		</tr>
		</table>
		</spr:form>
</body>
</html>