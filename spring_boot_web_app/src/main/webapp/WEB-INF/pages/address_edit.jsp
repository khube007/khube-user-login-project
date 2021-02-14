<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style>
			h1 {text-align: center;}
			pre {text-align: center;}
		</style>
		<title>Address Edit Page</title>
	</head>
	<body>
		<h1 style="color:green">Address Edit Page</h1>
		
		<form:form action="save" method="POST" modelAttribute="address">
			<pre>
				ID : <form:input path="aid" readonly="true"/>
				CITY : <form:input path="city"/>
				STATE : <form:input path="state"/>
				<c:choose>
					<c:when test="${'EDIT' eq Mode}">
						<input type="submit" value="CREATE"/>
					</c:when>
					<c:otherwise>
						<input type="submit" value="UPDATE"/>
					</c:otherwise>
				</c:choose>
			</pre>
		</form:form>
</body>
</html>