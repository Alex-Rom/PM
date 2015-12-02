<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reset Password</title>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
		
		<div style="color:green;">${ ok }</div>
		<div style="color:red;">${not_ok }</div>
		
		<form  action="Reset" method="POST">
			<div class="input-group">
				<span class="input-group-addon" id="basic-addon1">Cod Resetare Parola:</span> <input
					type="text" name="codReset" class="form-control" placeholder="COD"
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
				<span class="input-group-addon" id="basic-addon1">Parola Noua:</span> <input
					type="text" name="parolaNoua" class="form-control" placeholder="New Pass"
					aria-describedby="basic-addon1">
			</div>
			

			<p>
				<input type="submit" class="btn btn-primary btn-block" value="Change Password">
			</p>
			</form>
		</div>

	</div>


</body>
</html>