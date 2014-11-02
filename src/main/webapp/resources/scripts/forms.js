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
			  alert("entro al else");
			  if( $('#registerBrandForm').length ) {
				  alert("MARCA");
				  alertify.success("Marca registrada con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }
			  else if ( $('#registerProductForm').length ) {
				  alert("PRODUCTO");
				  alertify.success("Producto registrado con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }
			  else if ( $('#registerUserForm').length ) {
				  alert("USER");
				  alertify.success("Usuario registrado con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }
			  else {
				  alert("DEFAULT");
				  alertify.success("Formulario registrado con exito");
				  	setTimeout(function(){location.reload();}, 4000);
			  }


		  }
	  });
	  
	  $('.required').click(function(){
		  $('.required').css({'background-color' : '#FFF'})
	  });
});