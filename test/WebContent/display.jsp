<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="registration.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table border="1px solid black">

<tr>
	<td>Id</td>
	<td>Firstname</td>
	<td>Lastname</td>
	<td>Delete/Update</td>
</tr>

<c:forEach var="z" items="${sessionScope.data}" >

<tr>

	<td>${z.id}</td>
	<td>${z.fn}</td>
	<td>${z.ln}</td>
	<td><a href="display_data?key=0&id=<c:out value="${z.id}"/>" >Delete</a>/
		<a href="update.jsp?id=<c:out value="${z.id}"/>" >Update</a></td>
</tr>

</c:forEach>

</table>

</body>
</html>