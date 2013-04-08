$(document).ready(function() {
	$('.link_login').click(function() {

		type = $(this).attr('data-type');
		
		//$.get('modal/login', function() {
			
			$('.overlay-container').fadeIn(function() {
		
				window.setTimeout(function(){
				$('.window-container.'+type).addClass('window-container-visible');
				}, 100);
		
			});
			
		//});
		
	});
	
	$('.close').click(function() {
		$('.overlay-container').fadeOut().end().find('.window-container').removeClass('window-container-visible');
	});
	
	/*$(".form_login").submit(function(){
		
		$(".form_login").attr("action", "login");
		$.post('login', function() {
			
			alert("que pedo");
			
		});
		
	})*/;
			

});