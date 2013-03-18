 $(document).ready(function() { 

    $('#photoimg').live('change', function() { 
	           
    	$("#preview").html('');
	    $("#preview").html('<img src="resources/img/loader.gif" alt="Uploading...."/>');
	    
	    $("#imageform").ajaxForm({
				target: '#preview',
				url: '<c:url value="/updateImageProfile?url="/>' + $("#photoimg").val()  
				
	    }).submit();
	    
	});

 }); 