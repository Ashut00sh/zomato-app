<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Zomato Admin Home Page</title>
</head>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" 
integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" 
crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" 
crossorigin="anonymous">
</script>
<body>
		<table align="center">
		<tr>
		     
			<td><h1>Hello</h1></td>
			<td><h1><%= session.getAttribute("userkey").toString()%></h1></td>
			<td><h1>welcome to Zomato Admin Home</h1></td>
			
		</tr>
		<tr>
		     
			<td><a href="admin_menu.htm"><h2>Add Menu</h2></a></td>
		</tr>
		<tr>
		     
			<td><a href="admin_menu_list.htm"><h2>Selected Menu List</h2></a></td>
		</tr>
		<tr>
		 <td><a href="admin_logout.htm"><h2>Log Out</h2></a></td>
		 </tr>
		</table>
</body>
</html>