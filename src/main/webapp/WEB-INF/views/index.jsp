<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Inicio</title>
	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
    <!-- CSS Propio -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="wrapper">
	<header class="container-fluid">
		<div class="jumbotron jumbotron-fluid">
			<div class="container">
				<h1 class="text-center">RRSS</h1>
			</div>
		</div>
	</header>
	<main class="container-fluid">
		<div class="my-3">
			<a href="posts/list" class="btn btn-primary">Lista de posts</a>
		</div>
		<div class="my-3">
			<a href="datos" class="btn btn-primary">Cargar datos</a>
		</div>
	</main>
	</div>
</body>
</html>