$(function () {
	
		var date = new Date();
	    var currentMonth = date.getMonth();
	    var currentDate = date.getDate();
	    var currentYear = date.getFullYear();
	    
        $("#datepicker").datepicker({
            constrainInput: true,
            showOn: 'button',
            buttonImage: 'resources/img/1365307961_calendar_sticker.png',
            buttonImageOnly: true,
            maxDate: new Date(currentYear, currentMonth, currentDate),
            yearRange: "-40:+0",
            changeYear: true,
        	buttonText: "calendario"
        		
        });
        
        $("img[src$='1365307961_calendar_sticker.png']").height(50);
        
        $("img[src$='1365307961_calendar_sticker.png']").mouseover(function() {
            $(this).css('cursor','pointer');
        });
        
    });

jQuery(function($){
	  	   $.datepicker.regional['es'] = {
	  	      closeText: 'Cerrar',
	  	      prevText: '<Ant',
	  	      nextText: 'Sig>',
	  	      currentText: 'Hoy',
	  	      monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
	  	      monthNamesShort: ['Ene','Feb','Mar','Abr', 'May','Jun','Jul','Ago','Sep', 'Oct','Nov','Dic'],
	  	      dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
	  	      dayNamesShort: ['Dom','Lun','Mar','Mié','Juv','Vie','Sáb'],
	  	      dayNamesMin: ['Do','Lu','Ma','Mi','Ju','Vi','Sá'],
	  	      weekHeader: 'Sm',
	  	      dateFormat: 'dd/mm/yy',
	  	      firstDay: 1,
	  	      //minDate:new Date(d.setDate(d.getDate() + 1)),
	  	      isRTL: false,
	  	      showMonthAfterYear: false,
	  	      yearSuffix: ''};
	  	   $.datepicker.setDefaults($.datepicker.regional['es']);
});