function validateFields(status, message,field){

	alert("cojones --> " + status);
	$(function () {
									
		var name =$.trim($("#user_name").val());
		var lastName =$.trim($("#user_lastName").val());
		var email =$.trim($("#user_email").val());
		var password =$("#user_password").val();
		var confirmPassword =$("#user_password_confirm").val();
		var birthDay =$.trim($("#datepicker").val());
		//var sex = $('input:radio[name=sex]:checked').val();
				
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
		}
			
		showError(status,message,field);
						
										
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

function showError(status,message,field){
	
	if(!status){
		
		if(field != null && field != ""){
			
			if(field == 'email'){
				
				$("#user_email").focus();
				$("#user_email").css('background-color','#F6CECE');
				
			}else if(field == 'password'){
				
				$("#user_password_confirm").focus();
				
			}			
		}
		
		$(".message_error").addClass("msgbox error icon");
		$(".message_error").html(message);
		
	}/*else{
		
		$(".message_error").addClass("msgbox error icon");
		$(".message_error").html(message);
		$("#user_email").focus();
		$("#user_email").css('background-color','#F6CECE');
		
	}*/
	
	
}

/*function validatePassword(){
	
	if((password != "" && confirmPassword != "") && (password != confirmPassword)){

		$(".message_error").addClass("msgbox error icon");
		$(".message_error").html("Los contraseñas no coinciden");
		$("#user_password_confirm").focus();

	}
	
}*/
