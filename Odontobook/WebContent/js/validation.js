/***************************/
//@Author: Adrian "yEnS" Mato Gondelle & Ivan Guardado Castro
//@website: www.yensdesign.com
//@email: yensamg@gmail.com
//@license: Feel free to use it, but keep this credits please!					
/***************************/

$(document).ready(function(){
	//global vars
	var form = $("#customForm");
	var email = $("#email");
	var emailInfo = $("#emailInfo");
	var websiteConsultorio = $("#websiteConsultorio");
	var websiteConsultorioInfo = $("#websiteConsultorioInfo");
	
	//On blur
	email.blur(validateEmail);
	websiteConsultorio.blur(validateURL);
	//On key press
	name.keyup(validateName);
	pass1.keyup(validatePass1);
	pass2.keyup(validatePass2);
	message.keyup(validateMessage);
	//On Submitting

	
	//validation functions
	function validateEmail(){
		//testing regular expression
		var a = $("#email").val();
		var filter = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+@[a-zA-Z0-9]+[a-zA-Z0-9.-]+[a-zA-Z0-9]+.[a-z]{2,4}$/;
		//if it's valid email
		if(filter.test(a)){
			email.removeClass("error");
			emailInfo.text(" Ok!");
			emailInfo.removeClass("error");
			return true;
		}
		//if it's NOT valid
		else{
			email.addClass("error");
			emailInfo.text("  Pare com isto. Coloque um email válido! ");
			emailInfo.addClass("error");
			return false;
		}
	}
	function validateURL(){
		//testing regular expression
		var a = $("#websiteConsultorio").val();
		var filter = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+[a-zA-Z0-9]+.[a-z]{2,4}$/;
		//if it's valid email
		if(filter.test(a)){
			websiteConsultorio.removeClass("error");
			websiteConsultorioInfo.text("  Ok!");
			websiteConsultorioInfo.removeClass("error");
			return true;
		}
		//if it's NOT valid
		else{
			websiteConsultorio.addClass("error");
			websiteConsultorio.text("  Coloque um website válido. Senão já era!");
			websiteConsultorio.addClass("error");
			return false;
		}
	}
});