<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="login">
	<div id="messageError">
		<c:if test="${not empty error}">
			Tu usuario o contrase&ntilde;a son incorrectos
		</c:if>
	</div>
	<form:form id="loginUser" modelAttribute="loginForm"  method="post" autocomplete="off" accept-charset="utf-8">
		<table border="0">
			<tbody>
				<tr>	
					<td><form:errors path="j_username" id="messageError"/></td>
					<td><form:errors path="j_password" id="messageError"/></td>
				</tr>
				<tr>
					<td>Usuario:</td>
					<td >Password:</td>
				</tr>
				<tr>
					<td>
						<form:input id="username" path="j_username"   autofocus="true"/>
						
					</td>
					<td>
						<form:password   path="j_password"  id="password"/>
						
					</td>
					<td><input type="submit" id="submitBtnLogin" value="Entrar"></td>
				</tr>
				<tr>
					<td>
						<label>Recuerdame</label>
						<input type="checkbox" />
					</td>
					<td>
						<a href="<%=request.getContextPath()%>/register">Crear una cuenta</a>
					</td>
				</tr>
			</tbody>
		</table>
	</form:form>
</div>