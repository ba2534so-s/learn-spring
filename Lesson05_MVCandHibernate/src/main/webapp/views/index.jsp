<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome to Spring Boot MVC
	
	<form action="addDeveloper" method="post">
		Enter your id: <input type="text" name="developerId"><br>
		Enter your name: <input type="text" name="name"><br>
		<input type="submit" value="Register">
	</form>
	
</body>
</html>