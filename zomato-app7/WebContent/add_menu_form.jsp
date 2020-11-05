<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Menu List</title>
</head>
<body>
	<spr:form action="addmenu_form.htm" method="post" commandName="admin">
		<table class="table table-striped table-responsive-md btn-table" style="margin-left: 50vh;margin-top: 15vh">

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