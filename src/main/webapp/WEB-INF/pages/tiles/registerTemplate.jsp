<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><tiles:insertAttribute name="title"/></title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
	<link href='http://fonts.googleapis.com/css?family=Krona+One' rel='stylesheet' type='text/css'>	
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
  	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  	<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
  	<script src="resources/js/jquery.form.js"></script>
  	<script src="resources/js/datePicker.js"></script>
  	<script src="resources/js/messageError.js"></script>
</head>

<body>

	<div class="jumbotron">
	
  	</div>
  	
  	<div class="form-register">
    	<form:form action="#" method="post" modelAttribute="userForm">
			<form:errors path="*"><div class="message error mensajes">Todos los campos son obligatorios</div></form:errors>
  			<div class="cmp">
		        <form:input id="user_name" type="text" placeholder="Nombre" class="text_field" path="name" />
		    </div>
		    <div class="cmp">
		        <form:input id="user_lastName" type="text" placeholder="Apellidos" class="text_field" path="lastName" />
		    </div>
		    <div class="cmp">
		        <form:input id="user_email" type="text" placeholder="Correo electronico" class="text_field" path="email" />
		    </div>
		    <div class="cmp">
		        <form:input id="user_password" type="password" placeholder="Contraseña" class="text_field" path="password" />
		    </div>
		    <div class="cmp">
		        <form:input id="user_password_confirm" type="password" placeholder="Confirmar contraseña" class="text_field" path="confirmPassowrd" />
		    </div>
		    <div class="cmp">
		    	<form:input type="text" id="datepicker" placeholder="Fecha de nacimiento" class="text_field text_field_calendar" path="birthDay"/>
		    </div>
		    <div class="cmp">
	  			<form:input type = "radio"
	                 name = "sex"
	                 id = "male"
	                 value = "1" path="sex"/>
	          	<label class="gender" for = "sizeSmall">Hombre</label>
          
          		<form:input type = "radio"
	                 name = "sex"
	                 id = "female"
	                 value = "2" path="sex"/>
	          	<label class="gender" for = "sizeMed">Mujer</label>
	        </div>
  			<div class="cmp_button">
  				<button class="button primary button-block" type="submit">Regístrate</button>
  			</div>
		</form:form>
	</div>
	
</body>
</html>
