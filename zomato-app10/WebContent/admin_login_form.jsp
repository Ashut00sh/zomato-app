<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Page</title>
<link href="https://unpkg.com/browse/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet" >
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
	<spr:form action="a_login_admin.htm" method="post" commandName="user">
	<!-- admin form -->
	       <div class="col-md-6 login-form-2" style="margin-left: 80vh; margin-top: 15vh">
                    <h3>Login for Admin</h3>
                    <form>
                        <div class="form-group">
                            <spr:input path="userName" placeholder="Your Name*"/>
							<font color="red">
							<spr:errors path="userName"></spr:errors>
							</font>
                        </div>
                        <div class="form-group">
                            <spr:password path="userPass" placeholder="Your password*"/>
							<font color="red">
							<spr:errors path="userPass"></spr:errors>
							</font>
                        </div>
                        <div class="form-group">
                            <input type="submit" class="btnSubmit" value="Login" />
                        </div>
                        <div class="form-group">

                            <a href="forgot_password.html" class="ForgetPwd" value="Login">Forget Password?</a>
                            <a href="index.jsp" class="ForgetPwd" value="Login">Back Page</a>
                        </div>
                    </form>
                </div>

	</spr:form>
</body>
</html>