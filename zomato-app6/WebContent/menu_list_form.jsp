<%@page import="com.cdac.dto.Order"%>
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
	<%
	List<Order> elist = (List<Order>)request.getAttribute("olist");
	for(Order el:elist){
	%>
	<tr>
	<td><%= el.getMenuName() %></td>
	<td><%= el.getQuantity() %></td>
	<td><a href="o_delete.htm?orderId=<%= el.getOrderId() %>">Delete</a></td>
	<td><a href="o_update.htm?orderId=<%= el.getOrderId() %>">Update</a></td>
	</tr>
	<%} %>
	<tr><td><a href="home.jsp">CancleOrder</a></td></tr>
	<tr><td><a href="home.jsp">Confirm Order</a></td></tr>
	</table>
</body>
</html>