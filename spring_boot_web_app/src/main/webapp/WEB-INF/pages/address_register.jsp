<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>address register page</title>
	<style type="text/css">
		h1{text-align:center;color:green}
		pre{text-align:center;color:green}
		p{text-align:center;color:green}
		h3{text-align:center;color:blue}
	</style>
</head>
<body>

<h1 style="color:green">Address Register Page</h1>
	<form:form action="save" method="POST" modelAttribute="address">
		<pre>
			ADDRESS ID : <form:input path="aid" disabled="true"/>
			CITY : <form:input path="city"/>
			STATE : <form:input path="state"/>
			<c:choose>
				<c:when test="${'REGISTER' eq Mode}">
					<input type="submit" value="UPDATE"/>
				</c:when>
				<c:otherwise>
					<input type="submit" value="CREATE"/>
				</c:otherwise>
			</c:choose>
			<!-- <input type="submit" value="CREATE STUDENT"> -->
		</pre>
	</form:form>
		<p>Address Records ${message}</p>
		<h3><a href="showAll">Address Data</a></h3>
</body>
</html>