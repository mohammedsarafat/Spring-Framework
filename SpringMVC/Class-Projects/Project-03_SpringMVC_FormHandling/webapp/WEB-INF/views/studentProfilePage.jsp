<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Student Profile</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/studentProfilePage.css">

</head>

<body>

<div class="container py-5">

	<div class="row justify-content-center">

		<div class="col-lg-8">

			<div class="card profile-card border-0">

				<div class="card-body p-5">

					<div class="text-center">

						<div class="profile-icon">

							<i class="bi bi-person-circle"></i>

						</div>

						<h2 class="mt-3 fw-bold text-primary">
							${student.name}
						</h2>

						<p class="text-muted">
							Registered Student
						</p>

					</div>

					<hr>

					<div class="row mt-4">

						<div class="col-md-6 mb-4">

							<div class="info-box">

								<i class="bi bi-envelope-fill"></i>

								<div>

									<h6>Email Address</h6>

									<p>${student.email}</p>

								</div>

							</div>

						</div>

						<div class="col-md-6 mb-4">

							<div class="info-box">

								<i class="bi bi-telephone-fill"></i>

								<div>

									<h6>Mobile Number</h6>

									<p>${student.number}</p>

								</div>

							</div>

						</div>

						<div class="col-md-6 mb-4">

							<div class="info-box">

								<i class="bi bi-mortarboard-fill"></i>

								<div>

									<h6>Branch</h6>

									<p>${student.branch}</p>

								</div>

							</div>

						</div>

						<div class="col-md-6 mb-4">

							<div class="info-box">

								<i class="bi bi-award-fill"></i>

								<div>

									<h6>Status</h6>

									<p>Active Student</p>

								</div>

							</div>

						</div>

					</div>

					<hr>

					<div class="text-center">

						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-primary btn-lg px-4 me-2">

							<i class="bi bi-house-fill"></i>

							Home

						</a>

						<a href="${pageContext.request.contextPath}/registration"
							class="btn btn-success btn-lg px-4">

							<i class="bi bi-person-plus-fill"></i>

							New Registration

						</a>

					</div>

				</div>

			</div>

		</div>

	</div>

</div>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
