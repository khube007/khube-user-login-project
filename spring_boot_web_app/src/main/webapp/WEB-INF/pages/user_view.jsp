<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style type="text/css">
		/* h1 {text-align:center; color:gree;} */
	</style>
<title>USER VIEW PAGE</title>
</head>
	<body>
	<div class="container text-center">
		<div>
	        <h1>USER VIEW PAGE</h1>
  	    </div>
		<div>
        	<table class="table table-striped table-bordered">
            	<thead class="thead-dark">
					<tr>
						<th>USER ID</th>
						<td>${getUser.userId}</td>
					</tr>
					<tr>
						<th>EMAIL</th>
						<td>${getUser.email}</td>
					</tr>
					<tr>
						<th>FIRST NAME</th>
						<td>${getUser.firstName}</td>
					</tr>
					<tr>
						<th>LAST NAME</th>
						<td>${getUser.lastName}</td>
					</tr>
					
					<tr>
						<th>Student</th>
						<td>${getUser.listStudent}</td>
					</tr>
			</table>
		</div>
        <h3><a href="/user/register">Register</a></h3>
	</div>
</body>
</html>