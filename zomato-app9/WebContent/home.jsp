<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zomato Home Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
<!-- Bootstrap CSS --> 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" 
crossorigin="anonymous"> 

<meta name='viewport' content='width=device-width, initial-scale=1'> 
<link rel='stylesheet' type='text/css' media='screen' href='main.css'> 
<script src='main.js'></script> 
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
		 <td><a href="user_logout.htm"><h2>Log Out</h2></a></td>
		 </tr>
		</table>
</body>
</html>