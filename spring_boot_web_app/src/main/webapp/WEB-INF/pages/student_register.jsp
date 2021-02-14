<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style>
		h3 {text-align: center;}
		h1 {text-align: center;}
		pre {text-align: center;}
		b {text-align: center;}
		p {text-align: center;}
		/*div {text-align: center;} */
	</style>
	<title>Register Page</title>
</head>
<body>
	<h1 style="color:green">Student Register Page</h1>
	<form:form action="save" method="POST" modelAttribute="student">
		<pre>
			STUDENT NAME : <form:input path="sname"/>
			HOBBIES : <form:input path="hobbies"/>
			AGE : <form:input path="age"/>
			GENDER : <form:input path="gender"/>
			MOBILE NUMBER : <form:input path="mobileNumber"/>
			FEES : <form:input path="fees"/>
			Address : 			
					<select >
						<option value="" >--select--</option>
						<option > ${address}" </option>
					</select>
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
		<p>Student Records ${message}</p>
		<h3><a href="showAll">Student Data</a></h3>
</body>
</html>