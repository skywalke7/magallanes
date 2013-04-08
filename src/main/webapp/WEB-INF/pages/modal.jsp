<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="overlay-container">
			<div class="loginform cf window-container zoomin">
				<a href="#" title="cerrar" class="close">X</a>
				<form name="login" action="<c:url value="/" />" method="post" accept-charset="utf-8">
					<ul>
						<li>
							<label class="usermail" for="usermail">Email</label>
							<input type="email" name="j_username">
						</li>
						<li>
							<label class="password" for="password">Password</label>
							<input type="password" name="j_password"></li>
						<li>
							<input type="submit" value="Login">
						</li>
					</ul>
				</form>
			</div>		
</div>