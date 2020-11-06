<%@page import="com.cdac.dto.User"%>
<%@page import="com.cdac.dto.Admin"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu List</title>
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
	<tr><td><font color="blue"><h1>Select Menu From HotelOne</h1></font></td></tr>
	<%
	List<Admin> elist = (List<Admin>)request.getAttribute("order");
	for(Admin el:elist){
	%>
	<tr>
	<td><%= el.getDishName() %></td>
	<td><%= el.getPrice()%></td>
	<td><%= el.getQty()%></td>
	
	<td><a href="order_list.htm?userId=<%=((User)session.getAttribute("userkey")).getUserId()%>">ADD</a></td>
	
	</tr>
	<%} %>
	<tr><td><a href="home.jsp">back</a></td></tr>
	
	</table>
</body>
</html>