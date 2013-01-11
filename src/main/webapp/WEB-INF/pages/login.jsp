<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<title>Image-less CSS3 Glowing Form Implementation</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
	<script>
		$(function(){
		  var $form_inputs =   $('form input');
		  var $rainbow_and_border = $('.rain, .border');
		  /* Used to provide loping animations in fallback mode */
		  $form_inputs.bind('focus', function(){
		  	$rainbow_and_border.addClass('end').removeClass('unfocus start');
		  });
		  $form_inputs.bind('blur', function(){
		  	$rainbow_and_border.addClass('unfocus start').removeClass('end');
		  });
		  $form_inputs.first().delay(800).queue(function() {
			$(this).focus();
		  });
		});
	</script>
		<meta charset="utf-8"/>
		<link rel="stylesheet" href="resources/css/login.css" type="text/css"/>
	</head>
	<body id="home">
		<div class="rain">
			<div class="border start">
				<form:form id="login" modelAttribute="loginForm"  method="post" autocomplete="off">
					<label for="email">Email</label>
					<form:input id="username" path="j_username"  placeholder="Username" autofocus="true" required="true"/>
					<label for="pass">Password</label>
					<form:password   path="j_password"  id="password" placeholder="Password" required="true"/>
                                        <input type="submit" value="LOG IN"/>
                                        
				</form:form>
				<a href="register">registro</a>
			</div>
		</div>
	</body>
</html>