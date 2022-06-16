<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->

<link href="${contextPath}/resource/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Login:</h1>
		<div class="card">
			<div class="card-body">
				<form action="login.do" method="post">




					<div class=" form-group row">
						<label for="lastName" class="col-sm-2 col-form-label">User
							Name</label>
						<div class="col-sm-7">
							<input type="text" class="form-control" name="username"
								placeholder="Enter user name">
						</div>
					</div>

					<div class="form-group row">
						<label for="lastName" class="col-sm-2 col-form-label">Password</label>
						<div class="col-sm-7">
							<input type="password" class="form-control" name="password"
								placeholder="Enter Password">
						</div>
					</div>

				<span>	<button type="Login" class="btn btn-primary">Login</button>
					 <a href="displayRegistration.do" class="btn btn-primary">sign-up</a><br>
					</span> 
					<a href="" class="btn btn-link">Forgot you password?</a>
				</form>
			</div>
			<div class="container-fluid text-center copyright"
				style="bottom: o; position: fixed;">
				<p>&copy; 2022 @shu.All Rights Reserved</p>
			</div>
		</div>
	</div>
</body>
</html>