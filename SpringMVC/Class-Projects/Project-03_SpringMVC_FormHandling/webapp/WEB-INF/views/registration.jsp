<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Registration Form</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/registration.css">

</head>

<body>

	<form action="${pageContext.request.contextPath}/submit" method="post">

		<h1>Registration Form</h1>

		<div class="form-group">

			<label>Name</label> <input type="text" name="name"
				placeholder="Enter your name" required>

		</div>

		<div class="form-group">

			<label>Email</label> <input type="email" name="email"
				placeholder="Enter your email" required>

		</div>

		<div class="form-group">

			<label>Mobile</label> <input type="text" name="number"
				placeholder="Enter mobile number" required>

		</div>

		<div class="form-group">

			<label>Branch</label> <input type="text" name="branch"
				placeholder="Enter your branch" required>

		</div>

		<button type="submit">Register</button>

	</form>

</body>
</html>
