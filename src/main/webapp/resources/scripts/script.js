/**
function clearForm() {
	//var form = document.getElementById("registerUserForm");
	//form.reset();
	$("#box1").val('');
	$("#box2").val('');
	$("#box3").val('');
}
*/

/**
$( document ).ready(function() {
	$("#registerUserForm")[0].reset();
	$('#registerUserForm').children('input').val('')
	alert("surgundruleeeeeeeeeee!");
});
*/

$(function(){
	   
    $('#submitFormbutton').click(function(){

    	window.location.href = "http://localhost:8080/ferreteria/registerUser";
            alert('redirigio');

    }); 
    
});