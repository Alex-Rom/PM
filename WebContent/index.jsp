<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PM</title>
</head>
<body background="paper.jpg">
	<div class="container">
		<br>
		<div style="background-color: #D0D0D0  !important"
			class="jumbotron container-fluid">
			<div class="row">
				<div class="col-xs-12 col-md-6">
					<img src="image026.jpg" alt="logo">
					<p class="col-md-6">
					<h2 style="padding-left: 0px">
						<font face="broadway">Project management</font>
					</h2>
					</p>
				</div>
				<!--end of logo and slogan block-->

				<div class="col-xs-12 col-md-6">
				 
				 
				  <form action = "SignIn" method = "POST">
					<div class="row">
						<h4>
							<font face="calibri" color="#00AEC7"> Already have an
								account?</font>
						</h4>
						<div class="input-group">
							<span class="input-group-addon" id="basic-addon1"
								style="background-color: #004F59 !important"></span> <input
								type="text" class="form-control" name = "email" placeholder="Email"
								aria-describedby="basic-addon1">
						</div>
						<br>
						<div class="input-group">
							<span class="input-group-addon" id="basic-addon1"
								style="background-color: #004F59 !important"></span> 
							<input type="password" class="form-control" name = "password" placeholder="Password"
								aria-describedby="basic-addon1">
						</div><!--end of input text area block-->
						
						<div style="color:red;">${invalid}</div>
						
						<br>
						<div class="btn-group-6" role="group" aria-label="...">
							<button type="submit" class="btn btn-block" style="background-color: #004F59 !important">
							<font face="calibri" style="color: white !important"><b>SIGN IN</b></font>
							</button>
						</div>
						<!--end of SIGN IN button -->
					  </div>
				   </form> <!--end of SIGN IN FORM doGet() -->
					
					<div class="row">	
						
						<p style = "line-height: 20%"class="text-center"> <font face="calibri"
							color ="#00AEC7" size = "2px"> - or - </font>
						</p><!--end of - or - text -->
						
						<form action = "OpenForm" method="GET">
						<div class="btn-group-3" role="group" aria-label="...">
							<button type="submit" class="btn btn-block"
								style="background-color: #84BD00 !important">
								<font face="calibri" style="color: white !important"><b>SIGN
										UP</b></font>
							</button>
						</div>
						<!--end of SIGN UP button -->
						</form>
					</div>
					<!--end of row -->
				</div>
				<!--end of row -->

			</div>
			<!--end of sign in block -->

	<a style="text-align:right" href="resetareParola.jsp" >Ai uitat parola?</a>

		</div>
		<!--end of jumbotron-->
	</div>
	<!--end of container-->
<!-- 
	<div class="container">
		<div classs="row">
			<div style="padding-left: 30px" class="col-xs-12 col-md-4">

				<a href=""><img src="cyan.png" class="img-responsive img-circle"
					alt="Responsive image"></a>
			</div>
			<div class="col-xs-12 col-md-4">
				<a href=""><img src="negru.png" class="img-responsive"
					alt="Responsive image"></a>
			</div>
			<div class="col-xs-12 col-md-4">
				<a href=""><img src="roz.png" class="img-responsive"
					alt="Responsive image"></a>
			</div>
		</div>

	</div>
	-->
	<!--end of second container-->

</body>
</html>

<!--
<div class="input-group">
<span class="input-group-addon" id="basic-addon1" style = "background-color: #004F59!important"></span>
<input type="text" class="form-control" placeholder="E-mail address" aria-describedby="basic-addon1">
</div>
<br>
-->