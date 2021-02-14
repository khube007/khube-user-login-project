<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Address View Page</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
	<body>
	<div class="container text-center">
		 <div>
			<h1>Welcome to Address View Page</h1>
    	</div>
	<div >
		<table class="table table-striped table-bordered">
			 <thead class="thead-dark">
				<tr>
					<th>ADDRESS ID</th>
					<td>${getOneAddress.aid}</td>
				</tr>
				<tr>
					<th>CITY</th>
					<td>${getOneAddress.city}</td>
				</tr>
				<tr>
					<th>STATE</th>
					<td>${getOneAddress.state}</td>
				</tr>
			</table>
		</div>
	</div>
	</body>
</html>