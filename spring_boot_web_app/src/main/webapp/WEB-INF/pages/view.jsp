<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Student View Page</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
	<body>
	<div class="container text-center">
		 <div>
			<h1>Welcome to USER View Page</h1>
    	</div>
	<div >
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
			</table>
		</div>
	</div>
	</body>
</html>