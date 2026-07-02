<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Student Registration</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/registration.css">

</head>

<body>

<div class="background-overlay"></div>

<div class="container py-5">

	<div class="row justify-content-center align-items-center min-vh-100">

		<div class="col-lg-6 col-md-8">

			<div class="card register-card border-0">

				<div class="card-body p-5">

					<div class="text-center mb-4">

						<div class="icon-box">
							<i class="bi bi-person-plus-fill"></i>
						</div>

						<h2 class="fw-bold mt-3">
							Student Registration
						</h2>

						<p class="text-muted">
							Create your account to continue
						</p>

					</div>

					<form action="${pageContext.request.contextPath}/submit"
						method="post">

						<div class="mb-3">

							<label class="form-label fw-semibold">
								Full Name
							</label>

							<div class="input-group">

								<span class="input-group-text">
									<i class="bi bi-person-fill"></i>
								</span>

								<input
									type="text"
									class="form-control"
									name="name"
									placeholder="Enter Full Name"
									required>

							</div>

						</div>

						<div class="mb-3">

							<label class="form-label fw-semibold">
								Email Address
							</label>

							<div class="input-group">

								<span class="input-group-text">
									<i class="bi bi-envelope-fill"></i>
								</span>

								<input
									type="email"
									class="form-control"
									name="email"
									placeholder="Enter Email"
									required>

							</div>

						</div>

						<div class="mb-3">

							<label class="form-label fw-semibold">
								Mobile Number
							</label>

							<div class="input-group">

								<span class="input-group-text">
									<i class="bi bi-telephone-fill"></i>
								</span>

								<input
									type="text"
									class="form-control"
									name="number"
									placeholder="Enter Mobile Number"
									required>

							</div>

						</div>

						<div class="mb-4">

							<label class="form-label fw-semibold">
								Branch
							</label>

							<div class="input-group">

								<span class="input-group-text">
									<i class="bi bi-mortarboard-fill"></i>
								</span>

								<input
									type="text"
									class="form-control"
									name="branch"
									placeholder="Enter Branch"
									required>

							</div>

						</div>

						<div class="d-grid">

							<button class="btn btn-lg register-btn">

								<i class="bi bi-check-circle-fill"></i>

								Register Now

							</button>

						</div>

					</form>

					<hr class="my-4">

					<div class="row text-center">

						<div class="col">

							<a href="${pageContext.request.contextPath}/home"
								class="btn btn-outline-primary w-100">

								<i class="bi bi-house-fill"></i>

								Home

							</a>

						</div>

						<div class="col">

							<a href="${pageContext.request.contextPath}/about"
								class="btn btn-outline-success w-100">

								<i class="bi bi-info-circle-fill"></i>

								About

							</a>

						</div>

						<div class="col">

							<a href="${pageContext.request.contextPath}/profile"
								class="btn btn-outline-warning w-100">

								<i class="bi bi-person-circle"></i>

								Profile

							</a>

						</div>

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
