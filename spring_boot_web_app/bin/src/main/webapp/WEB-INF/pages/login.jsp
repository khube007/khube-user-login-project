<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
	<h2>WELCOME TO USER LOGIN PAGE</h2>
		<form:form action="login" method="POST" modelAttribute="login">
			<pre>
				USER NAME : <input type="text" name = "userName" required="required"><br>
				PASSWORD : <input type="password" name="password" required="required"/><br>
				<input type="submit" value="Login">
			</pre>
		</form:form>
</body>
</html>