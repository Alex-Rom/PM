<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
		
		<div style="color:green;">${ mesaj_ok }</div>
		<div style="color:red;">${ mesaj_not_ok }</div>
		
		<form  action="SignUp" method="POST">
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">Prenume:</span> <input
					type="text" name="prenume" class="form-control" placeholder="Mike"
					aria-describedby="basic-addon1">
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">Nume:</span> <input
					type="text" name="nume" class="form-control" placeholder="Johnson"
					aria-describedby="basic-addon1">
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">Email:</span> <input
					type="text" name="email" class="form-control" placeholder="Email"
					aria-describedby="basic-addon1">
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">Password:</span> <input
					type="password" name="password" class="form-control" placeholder="Password"
					aria-describedby="basic-addon1">
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">Telefon:</span> <input
					type="text" name="telefon" class="form-control" placeholder="Telefon"
					aria-describedby="basic-addon1">
			</div>
			<br>

			<p>
				<input type="submit" class="btn btn-primary btn-block" value="Sign up">
			</p>
			</form>
		</div>

	</div>


</body>
</html>