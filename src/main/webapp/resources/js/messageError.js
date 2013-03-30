function validateFields(status){

	$(function () {
							
		var name =$.trim($("#user_name").val());
		var lastName =$.trim($("#user_lastName").val());
		var email =$.trim($("#user_email").val());
		var password =$("#user_password").val();
		var confirmPassword =$("#user_password_confirm").val();
		var birthDay =$.trim($("#datepicker").val());
		var sex = $('input:radio[name=sex]:checked').val();
				
		if(name == ""){
			$("#user_name").focus();			
		}else if(lastName == ""){
			$("#user_lastName").focus();
		}else if(email == ""){		
			$("#user_email").focus();	
		}else if(password == ""){
			$("#user_password").focus();		
		}else if(confirmPassword == ""){		
			$("#user_password_confirm").focus();		
		}else if(birthDay == ""){
			$("#datepicker").focus();		
		}else if(sex == undefined){
			$("#sex").focus();		
		}
		
		if(status){
			
			$(".message_error").addClass("msgbox error icon");
			$(".message_error").html("La estructura del email es incorrecta");
			$("#user_email").focus();
			$("#user_email").css('background-color','#F6CECE');
			
			
		}else{
			
			$(".message_error").addClass("msgbox error icon");
			$(".message_error").html("Todos los campos son obligatorios");
			
		}
		
	});

}

function checkRadio(value){
	
	$(function () {
		$(":radio[name='sex'][value='"+value+"']").attr('checked', true);
	});
	
}
	
/*Function to validate email*/

function isEmail(email) {
	
	if (email.length > 0) {
		
		// /^[^0-9][a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)[@][a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)[.][a-zA-Z]{2,4}$/
		if (!/^[_a-z0-9-]+(.[_a-z0-9-]+)@[a-z0-9-]+(.[a-z0-9-]+)(.[a-z]{2,3})$/.test(email)) {
			
			return false;
			
		} else {
			
			return true;
			
		}
	
	}	
}