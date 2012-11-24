<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div class="rain">
			<div class="border start">
				<form:form id="username" modelAttribute="registerForm"  method="post" autocomplete="off">
					<label for="username">username</label>
					<form:input id="username" path="username"  placeholder="Username" autofocus="true" required="true"/>
					<label for="pass">Password</label>
					<form:password path="password"  id="password" placeholder="Password" required="true"/>
                                        <input type="submit" value="LOG IN"/>
                                        
				</form:form>
			</div>
		</div>
</body>
</html>