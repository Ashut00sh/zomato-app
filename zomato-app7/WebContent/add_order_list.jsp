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