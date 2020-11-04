<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link href="https://unpkg.com/browse/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>

<body>
	<spr:form action="login.htm" method="post" commandName="user">
	<table align="center" class="form-control">
		<tr>
			<td><h1>Login Here</h1></td>
		</tr>
			<tr>
			<td> </td>
		</tr>
		<tr>
			<td>userName</td><td><spr:input path="userName"/>
			<font color="red">
			<spr:errors path="userName"></spr:errors></td>
			</font>
		</tr>
		<tr>
			<td>Password</td><td><spr:password path="userPass"/>
			<font color="red">
			<spr:errors path="userPass"></spr:errors></td>
			</font>
		</tr>
		<tr>
		<tr>
			<td><a href="index.jsp">Back</a></td>
			<td><input type="submit" value="Login"></td>
		</tr>
		<form>
  <div class="form-group">
    <label for="email">Email address:</label>
    <input type="email" class="form-control" placeholder="Enter email" id="email">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" placeholder="Enter password" id="pwd">
  </div>
  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
		</table>
		</spr:form>
</body>
</html>