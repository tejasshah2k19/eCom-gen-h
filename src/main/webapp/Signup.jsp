<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>

	<form action="SignupServlet" method="post">
		FirstName: <input type="Text" name="firstName"
			value="${firstNameValue}" /> ${firstNameError } <br> <Br>
		LastName : <input type="text" name="lastName" value="${lastNameValue}" />${lastNameError }<br>
		<br> Email : <input type="text" name="email" /><br> <br>
		Password : <input type="text" name="password" /><br> <br> <input
			type="submit" value="Signup" />

	</form>
</body>
</html>