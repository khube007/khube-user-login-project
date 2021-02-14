<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>address data page</title>
</head>
<body>
	<h3>WELCOME TO ADDRESS DATA</h3>
	<table>
		<tr>
			<th>ADDRESS ID</th>
			<th>CITY</th>
			<th>STATE</th>
			<th colspan=2>OPERATIONS</th>
		</tr>

		<c:forEach items="${lists}" var="list">
			<tr>
				<td><c:out value="${list.aid}" /></td>
				<td><c:out value="${list.city}" /></td>
				<td><c:out value="${list.state}" /></td>
				<td>
					<a href="delete?aid=${list.aid}">DELETE</a>
					<a href="edit?aid=${list.aid}">EDIT</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>