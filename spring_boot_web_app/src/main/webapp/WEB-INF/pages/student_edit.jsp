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
		<title>Student Edit Page</title>
	</head>
	<body>
		<h1 style="color:green">Student Edit Page</h1>
		
		<form:form action="save" method="POST" modelAttribute="student">
			<pre>
				ID : <form:input path="sid" readonly="true"/>
				ROLL NO : <form:input path="rollNo"/>
				STUDENT NAME : <form:input path="sname"/>
				AGE : <form:input path="age"/>
				FEES : <form:input path="fees"/>
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