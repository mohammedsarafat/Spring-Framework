<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home | Spring MVC</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/homePage.css">

</head>

<body>

	<div class="container">

		<div class="row justify-content-center">

			<div class="col-lg-8">

				<div class="home-card">

					<h1>Good Evening Everyone</h1>

					<p class="subtitle">Welcome to Spring MVC Framework</p>

					<hr>

					<h3>We have learned to create Spring MVC Project</h3>

					<p class="description">Spring MVC is one of the most popular
						Java frameworks used for developing enterprise-level web
						applications based on the Model-View-Controller architecture.</p>

					<div class="btn-group-custom">

						<a href="${pageContext.request.contextPath}/about"
							class="btn btn-primary"> About Us </a> <a
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
