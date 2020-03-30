<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="success.css">
<script src="loginregister.js"></script>

</head>
<body>
	<% 
	boolean logged=(boolean)session.getAttribute("loggedIn");
	
	if(logged == false)
	response.sendRedirect("login.html");
	%>

	<header>
		<div class="logo">
				<img src="logo.jpg" alt="logo">
		</div>
		<div class="wrapper">
			
			<ul class="nav-area">
				<li><a href="#">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="profileDisplay">Myprofile</a></li>
				<li id="abouttext" onclick="displayAbout()"><a href="#">Contact</a></li>
				<li id="logintext"><a href="logout">Logout</a></li>
			</ul>
		</div>
		<div class="message">
			<h1>Successfully Logged-In</h1>
		</div>
	</header>
</body>
</html>