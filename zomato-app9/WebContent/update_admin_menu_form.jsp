<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Admin Menu List Form</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
<!-- Bootstrap CSS --> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" 
crossorigin="anonymous"> 

<meta name='viewport' content='width=device-width, initial-scale=1'> 
<link rel='stylesheet' type='text/css' media='screen' href='main.css'> 
<script src='main.js'></script> 
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

			<td><a href="admin_menu_list.htm">Back</a></td>
			<td><input type="submit" value="Update"></td>
		</tr>
		</table>
		</spr:form>
</body>
</html>