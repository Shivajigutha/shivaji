function displayRegister(){
	document.getElementById("logindiv").style="display:none";
	document.getElementById("registerdiv").style="display:block";

}

function displayLogin(){
	document.getElementById("logindiv").style="display:block";
	document.getElementById("registerdiv").style="display:none";
	

}
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

 function mouseinbutton(){
	//document.getElementById("line").style = "background:grey";
	

	$("#loginsubmit").css("background", "green");
	$("#registersubmit").css("background", "green");


}
function mouseoutbutton(){
//document.getElementById("line").style = "background:white";

	
	$("#loginsubmit").css("background", "white");
	$("#registersubmit").css("background", "white");

 }