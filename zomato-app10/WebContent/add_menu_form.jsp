<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Menu List</title>
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
	<spr:form action="addmenu_form.htm" method="post" commandName="admin">
		<table class="table table-striped table-responsive-md btn-table" style="margin-left: 5vh;margin-top: 15vh">

  <thead>
    <tr>
      <th>No</th>
      <th>Dish Name</th>
      <th>Quantity</th>
      <th>price</th>
      <th>  </th>
    </tr>
  </thead>

  <tbody>
    <tr>
      <th scope="row">1</th>
   
      <td><spr:input path="dishName"/></td>
      <td><spr:input path="qty"/></td>
      <td><spr:input path="price"/></td>
      <td>
        <button type="button" class="btn btn-teal btn-rounded btn-sm m-0">
        <input type="submit" value="ADD Menu">
        </button>
      </td>
    </tr>
         <td><a href="admin_home.jsp">Back</a></td>
  </tbody>

</table>
	</spr:form>
</body>
</html>