<%@page import="com.cdac.dto.Admin"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Menu List</title>
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
	<tr><td><font color="green"><h1>Admin Menu List HotelOne</h1></font></td></tr>
	<%
	List<Admin> elist = (List<Admin>)request.getAttribute("alist");
	for(Admin el:elist){
	%>
	<tr>

	<td><%= el.getDishId()%></td><td>     </td>
	<td><%= el.getDishName() %></<td>  </td>
	<td><%= el.getPrice() %></td><td>  </td>
	<td><%= el.getQty() %></td><td>  </td>
	<td><a href="a_m_delete.htm?dishId=<%= el.getDishId() %>">Delete</a></td>
	<td><a href="a_m_update.htm?dishId=<%= el.getDishId() %>">Update</a></td>
	</tr>
	<%} %>
	<tr><td><a href="admin_home.jsp">Back</a></td></tr>
	<tr><td><a href="admin_home.jsp">Confirm Menu</a></td></tr>
	</table>
</body>
</html>