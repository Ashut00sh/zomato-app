<%@page import="com.cdac.dto.Admin"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Menu List</title>
</head>
<body>
	<table align="center">
	<tr><td><font color="green"><h1>Admin Menu List</h1></font></td></tr>
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
	<tr><td><a href="home.jsp">Cancle Menu</a></td></tr>
	<tr><td><a href="index.jsp">Confirm Menu</a></td></tr>
	</table>
</body>
</html>