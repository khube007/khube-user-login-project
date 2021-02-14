<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user details</title>
</head>
<body>
	<h3>WELCOME TO USER DATA</h3>
	<table>
		<tr>
			<th>USER ID</th>
			<th>USER NAME</th>
			<th>EMAILS</th>
			<th>MOBILE NUMBER</th>
			<th>USER</th>
			<th>PASSWORD</th>
			<th colspan=2>OPERATIONS</th>
		</tr>

		<c:forEach items="${userList}" var="list">
			<tr>
				<td><c:out value="${list.userId}" /></td>
				<td><c:out value="${list.userName}" /></td>
				<td><c:out value="${list.email}" /></td>
				<td><c:out value="${list.mobileNumber}" /></td>
				<td><c:out value="${list.userNameId}" /></td>
				<td><c:out value="${list.password}" /></td>

				<td>
					<a href="delete?sid=${list.userId}">DELETE</a>
					<a href="edit?sid=${list.userId}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>