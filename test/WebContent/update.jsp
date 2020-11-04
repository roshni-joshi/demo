<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
int id = Integer.parseInt(request.getParameter("id"));

%>

<h3>Updation form</h3>

<form action="display_data">

New Firstname : <input type="text" name="fn" placeholder="Enter new firstname" required /><br/>
New Lastname : <input type="text" name="ln" placeholder="Enter new lastname" required /><br/>
<input type="hidden" name="id" value="<%out.print(id);%>" />
<input type="hidden" name="key" value="2" />

<input type="submit" />

</form>


</body>
</html>