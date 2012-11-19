<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SignUp form</title>
</head>
<body>

	<h1>Fill the following form to signup</h1>

	<form action="/signup" method="post">

		<label for="firstName">First name</label>
		<input type="text" id="firstName" required="true"/><br />
		<label for="lastName">Last name</label>
		<input type="text" id="lastName" required="true"/><br />
		<label for="email">Email</label>
		<input type="text" id="email" required="true"/><br />
		<label for="password">Password</label>
		<input type="password" id="password" required="true"/><br />
		<label for="confirm">Confirm password</label>
		<input type="password" id="confirm" required="true"/><br />
		
		<input type="submit" value="Sign up" />
		<input type="reset" value="Clean" />

	</form>

</body>
</html>

