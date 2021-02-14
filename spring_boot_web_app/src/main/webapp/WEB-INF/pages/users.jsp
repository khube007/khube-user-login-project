<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>List Users</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container text-center">
    <div>
        <form:form action="/logout" method="post">
            <p>
                Welcome <b>${pageContext.request.userPrincipal.name} </b>
            </p>
            <input type="submit" value="Sign Out" />
        </form:form>
    </div>
    <div>
        <h1>List of Users</h1>
    </div>
     
    <div>
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>User ID</th>
                    <th>E-mail</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Student</th>
                    <th colspan="2">Operation</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${listUser}" var="list">
				<tr>
					<td><c:out value="${list.userId}" /></td>
					<td><c:out value="${list.email}" /></td>
					<td><c:out value="${list.firstName}" /></td>
					<td><c:out value="${list.lastName}" /></td>
					<td><c:out value="${list.listStudent}" /></td>
					<td>
						<a href="delete?userId=${list.userId}">DELETE</a>
						<a href="edit?userId=${list.userId}">EDIT</a>
					</td>
				</tr>
			</c:forEach>
            </tbody>
        </table>
        <h3><a href="/user/register">Register</a></h3>
    </div>
</div>
</body>
</html>