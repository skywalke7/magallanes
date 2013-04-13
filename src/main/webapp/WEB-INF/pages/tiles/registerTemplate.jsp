<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<title><tiles:insertAttribute name="title"/></title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/style_modal.css" />
	<link rel="stylesheet" type="text/css" href="resources/css/normalize.css">
	<link rel="stylesheet" type="text/css" href="resources/css/style_form.css">
	<link href='http://fonts.googleapis.com/css?family=Krona+One' rel='stylesheet' type='text/css'>	
	<link href='http://fonts.googleapis.com/css?family=Istok+Web:700' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
  	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  	<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
  	<script src="resources/js/jquery.form.js"></script>
  	<script src="resources/js/datePicker.js"></script>
  	<script src="resources/js/function_modal.js"></script>
  	<script src="resources/js/messageError.js"></script>
</head>

<body>

	<div class="jumbotron">
		<div class="login">
			<img src="<%=request.getContextPath()%>/resources/img/1364639596_home.png" alt="icon for login" class="icon_home">
			<span class="link_login" data-type="zoomin">¿Tienes una cuenta? <b>¡Entra ya!</b></span>
		</div>
  	</div>
  	
  	<div class="form-register"> 
    	<form:form modelAttribute="userForm" id="formRegister" accept-charset="UTF-8">
    		<div class="cmp">
    			<h1>Únete a KukuDev.</h1>
    		</div>
    		<c:if test="${not empty gender}">
		    		<script>checkRadio('${gender}');</script>
		    </c:if>
		    <!--<c:choose>
		    	<c:when test="${not empty error && not empty message}">
		    		<div class="message_error"></div>
		    		<script>validateFields(${error},'${message}');</script>
		    	</c:when>
		    	<c:otherwise>
		    		<script>validatePassword();</script>
		    	</c:otherwise>
		    </c:choose>-->
		    <c:if test="${not empty error && not empty message}">
		    		<div class="message_error"></div>
		    		<script>validateFields(${error},'${message}','${field}');</script>
		    </c:if>
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
	                 id = "sex"
	                 value = "1" path="sex"/>
	          	<label class="gender" for = "sizeSmall">Hombre</label>
          
          		<form:input type = "radio"
	                 name = "sex"
	                 id = "sex"
	                 value = "2" path="sex"/>
	          	<label class="gender" for = "sizeMed">Mujer</label>
	        </div>
	        <p class="privacy_policy">Al hacer clic en "Regístrate" a continuación, usted está de acuerdo con los <a href="" class="spp">Servicios y la Políticas de Privacidad </a>.</p>
  			<div class="cmp_button">
  				<button class="button primary button-block" >Regístrate</button>
  			</div>
		</form:form>
	</div>
	<tiles:insertAttribute name="modal"/>	
</body>
</html>
