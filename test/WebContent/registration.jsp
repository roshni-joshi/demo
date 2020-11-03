<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Registration Form</h3><br/>

<form action="register">

Firstname : <input type="text" name="fn" placeholder="Enter firstname" required /><br/>
Lastname : <input type="text" name="ln" placeholder="Enter lastname" required /><br/>

<input type="submit" />

</form>

<br/>

<a href="display_data?key=1">Search all data</a><br/>



</body>
</html>