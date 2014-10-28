$(document).ready(function() {
	$(window).resize(function(){location.reload();});

  $("#brands").owlCarousel({

      autoPlay: 3000, //Set AutoPlay to 3 seconds

      items : 4,
      itemsDesktop : [1199,3],
      itemsDesktopSmall : [979,3]

  });
  alert("corre el js");
  $("#registerUserForm").submit(function(){
	    var isFormValid = true;
	    alert("Please fill in all the required fields (indicated by *)");

	    $(".required input").each(function(){
	        if ($.trim($(this).val()).length == 0){
	            $(this).addClass("highlight");
	            isFormValid = false;
	        }
	        else{
	            $(this).removeClass("highlight");
	        }
	    });

	    if (!isFormValid) alert("Please fill in all the required fields (indicated by *)");

	    return isFormValid;
	});

});