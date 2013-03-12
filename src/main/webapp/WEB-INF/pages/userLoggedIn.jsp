<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="width:600px">

<form id="imageform" method="post" enctype="multipart/form-data" action=''>
Upload your image <input type="file" name="photoimg" id="photoimg" />
</form>
<div id='preview'>
</div>


</div>
<div id="ProfileCard">
	<img id="ProfilePhoto" alt="Profile photo" src="resources/img/anonymousProfile.png">
  	<p id="User"><span id="Messages"></span>${username}</p>
    <br><p id="UserOptions">Mensajes <span class="Separator">|</span> Configurar cuenta <span class="Separator">|</span> 
    <a href="<c:url value='j_spring_security_logout' />" > Cerrar sesi&oacute;n</a></p>
</div>