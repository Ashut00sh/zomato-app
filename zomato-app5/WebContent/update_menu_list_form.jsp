<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Menu List Form</title>
</head>
<body>
	<spr:form action="menu_update.htm" method="post" commandName="order">
	<table align="center">
	<tr>
			<td></td><td><spr:hidden path="orderId"/></td>
		</tr>
		<tr>
			<td>Menu Name</td><td><spr:input path="menuName"/></td>
		</tr>
		<tr>
			<td>quantity</td><td><spr:input path="quantity"/></td>
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