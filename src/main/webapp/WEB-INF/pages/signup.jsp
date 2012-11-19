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
	
	<style type="text/css">
	
	form fieldset{
		margin:20px 0px 20px 0px;
		width:350px;
		position:relative;
		display:block;
		padding: 0 10px 10px 10px;
		}
		
	label{
		display:block;
		float:left;
		width:150px;
		text-align:left;
		margin:0px 5px 0px 0px;
		}
	
	</style>
	
</head>

<body>

	<h1>Fill the following form to sign up</h1>

	<form:form id="signUpForm" modelAttribute="signUpForm" method="post" autocomplete="off">
	
		<fieldset>
			<legend>Personal information</legend>
			<br />
			<label for="firstName">First Name</label>
			<form:input id="firstName" path="firstName"/>
			<label for="lastName">Last name</label>
			<form:input id="lastName" path="lastName" />
		</fieldset>
		<fieldset>
			<legend>Account information</legend>
			<br />
			<label for="email">Email</label>
			<form:input path="email"/>
			<label for="password">Password</label>
			<form:password path="password"/>
			<label for="confirmPassword">Confirm password</label>
			<form:password path="confirmPassword" />
		</fieldset>
		
		<input type="submit" value="Sign up" />
		<input type="reset" value="Clean" />
	
	</form:form>

</body>
</html>

