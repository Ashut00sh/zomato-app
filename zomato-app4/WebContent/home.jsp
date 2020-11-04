<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato Home Page</title>
</head>
<body>
		<table align="center">
		<tr>
		     
			<td><h1>Hello</h1></td>
			<td><h1><%= session.getAttribute("userkey").toString()%></h1></td>
			<td><h1>welcome to Zomato choose the fields</h1></td>
			
		</tr>
		<tr>
		     
			<td><a href="order_form.htm"><h2>Select Menu</h2></a></td>
		</tr>
		<tr>
		     
			<td><a href="menu_list.htm"><h2>Selected Menu List</h2></a></td>
		</tr>
		<tr>
		 <td><a href="index.jsp"><h2>Log Out</h2></a></td>
		 </tr>
		</table>
</body>
</html>