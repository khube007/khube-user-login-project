<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="ISO-8859-1">
    <title>Sign Up - Khube Project</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	 <div class="container text-center">
        <div>
            <h1>User Registration - Sign Up</h1>
        </div>
        <form:form action = "/user/update" method="post" style="max-width: 600px; margin: 0 auto;" modelAttribute="user">
	        
	        <div class="m-3">
    	        <div class="form-group row">
        	        <label class="col-4 col-form-label">User Id: </label>
                <div class="col-8">
                    <input type="text" name="userId" class="form-control" disabled="disabled" />
                </div>
            </div>
	        
    	        <div class="form-group row">
        	        <label class="col-4 col-form-label">E-mail: </label>
                <div class="col-8">
                    <input type="email" name="email" class="form-control" required />
                </div>
            </div>
             
            <div class="form-group row">
                <label class="col-4 col-form-label">Password: </label>
                <div class="col-8">
                    <input type="password" name="password" class="form-control" required minlength="6" maxlength="10"/>
                </div>
            </div>
             
            <div class="form-group row">
                <label class="col-4 col-form-label">First Name: </label>
                <div class="col-8">
                    <input type="text" name="firstName" class="form-control" required minlength="2" maxlength="20"/>
                </div>
            </div>
             
            <div class="form-group row">
                <label class="col-4 col-form-label">Last Name: </label>
                <div class="col-8">
                    <input type="text" name="lastName" class="form-control" required minlength="2" maxlength="20" />
                </div>
            </div>
             
            <div>
                <button type="submit" class="btn btn-primary">Update User</button>
            </div>
        </div>
        </form:form>
    </div>
</body>
</html>