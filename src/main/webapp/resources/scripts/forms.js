$(document).ready(function() {

	  $(':input')
	 .not(':button, :submit, :reset, :hidden')
	 .val('')
	 .removeAttr('checked')
	 .removeAttr('selected');
	  
	  $('#submitFormbutton').click(function( event ) {
		  var isFormValid = true;
		  
		  $(".required").each(function(){
		        if ($.trim($(this).val()).length == 0){
		            isFormValid = false;
		        }
		  });
		  
		  if (!isFormValid) {
		    	alertify.alert("Por favor ingrese los datos correctamente");
		    	$('.required').css({'background-color' : '#FFFF16'})
  							  .val('');
		    		  event.preventDefault();
		    }
		  else {
			  if( $('#registerBrandForm').length ) {
				  alertify.success("Marca registrada con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }
			  else if ( $('#registerProductForm').length ) {
				  alertify.success("Producto registrado con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }
			  else if ( $('#registerUserForm').length ) {
				  alertify.success("Usuario registrado con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }
			  else {
				  alertify.success("Formulario registrado con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }


		  }
	  });
	  
	  $('.required').click(function(){
		  $('.required').css({'background-color' : '#FFF'})
	  });
});