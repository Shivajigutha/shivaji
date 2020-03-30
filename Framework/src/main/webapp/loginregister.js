function mouseintext(){
	//document.getElementById("line").style = "background:grey";
	

	$("#registerpage").css("background", "grey");
	$("#loginpage").css("background", "grey");
	

}
function mouseouttext(){
//document.getElementById("line").style = "background:white";

	$("#registerpage").css("background", "white");
	$("#loginpage").css("background", "white");
	

 }
 
 function displayLogin(){
	document.getElementById("logindiv").style="display:block";
	document.getElementById("registerdiv").style="display:none";
	document.getElementById("resetdiv").style="display:none";
 }
 function displayRegister(){
	document.getElementById("registerdiv").style="display:block";
	document.getElementById("logindiv").style="display:none";
	document.getElementById("resetdiv").style="display:none";



 }
 function displayReset(){
	document.getElementById("resetdiv").style="display:block";
	document.getElementById("registerdiv").style="display:none";
	document.getElementById("logindiv").style="display:none";

 }
 function displayAbout(){
	document.getElementById("homediv").style="display:none";
	document.getElementById("aboutdiv").style="display:block";
 }
 function displayHome(){
	document.getElementById("homediv").style="display:block";
	document.getElementById("aboutdiv").style="display:none";
 }

 function displayCompany(){
		document.getElementById("clientdiv").style="display:none"; 
		document.getElementById("companydiv").style="display:block";
 }
 function displayClient(){
	 document.getElementById("companydiv").style="display:none";
	document.getElementById("clientdiv").style="display:block"; 
 }


 function loginPage(){
	 location.replace("login.html");
 }
 function homePage(){
	 location.replace("landing.html");
 }
 function contactPage(){
	 location.replace("contact.html");
 }
 
 function match(){
	 var newpassword = document.getElementById("password1");
	 var confirmpassword = document.getElementById("password2");
	 if(newpassword!=confirmpassword)
	 e.preventDefault();
	// alert("Password mismatch")

 
}

