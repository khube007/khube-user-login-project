<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false"%>
    
    <%@taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style type="text/css">
			h1{color:green; text-align:center}
			h3{color:green; text-align:center}
			p{color:blue; text-align:center}
			pre{color:blue; text-align:center}
		</style>
		<title>create user page</title>
	</head>
<body>
	<h1> WELCOME TO USER REIGSTRATION PAGE</h1>
		<form:form action="save" method="POST" modelAttribute="user">
			<pre>
				USER ID : <form:input path="userId" disabled="true"/><br>
				USER NAME : <form:input path="userName"/><br>
				EMAIL : <form:input path="email"/><br>
				MOBILE NUMBER : <form:input path="mobileNumber"/><br>
				USER : <form:input path="userNameId"/><br>
				PASSWORD : <form:input path="password"/><br>
				<input type="submit" value="REGISTER">
			</pre>
		</form:form>
		<p>User Records ${userMessage}</p>
		<h3><a href="allUsers">User Data</a></h3>
</body>
</html>