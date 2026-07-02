<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>About Us | Spring MVC</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/aboutUs.css">

</head>

<body>

	<div class="container">

		<div class="row justify-content-center">

			<div class="col-lg-8">

				<div class="about-card">

					<h1>About Us</h1>

					<p class="sub-title">Welcome to Spring MVC Project</p>

					<hr>

					<div class="profile-image">

						<img src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
							alt="Profile">

					</div>

					<table class="table table-borderless mt-4">

						<tr>
							<th>Name</th>
							<td>NareshIT</td>
						</tr>

						<tr>
							<th>Email</th>
							<td>nit123@gmail.com</td>
						</tr>

						<tr>
							<th>Address</th>
							<td>Hyderabad</td>
						</tr>

						<tr>
							<th>Course</th>
							<td>Full Stack Java Development</td>
						</tr>

						<tr>
							<th>Framework</th>
							<td>Spring MVC</td>
						</tr>

					</table>

					<div class="buttons">

						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-primary"> Home </a> <a
							href="${pageContext.request.contextPath}/registration"
							class="btn btn-success"> Registration </a> <a
							href="${pageContext.request.contextPath}/profile"
							class="btn btn-warning"> Profile </a>

					</div>

				</div>

			</div>

		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
