<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>El mundo de PP - Lista de Comentarios, Post ${post.getId()}</title>
	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
	<!-- jQuery -->
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
 	<!-- DataTables -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.11/css/jquery.dataTables.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/DataTables/Responsive-2.2.5/css/responsive.bootstrap4.min.css">
    <script type="text/javascript" src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/DataTables/Responsive-2.2.5/js/dataTables.responsive.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/DataTables/Responsive-2.2.5/js/responsive.bootstrap4.min.js"></script>
    <!-- Script propio -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/listadocomments.js"></script>
    <!-- CSS Propio -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="wrapper">
	<main class="container-fluid">
		<h2 class="mb-3">Listado de comentarios - Post N° ${post.getId()}</h2>
		<div class="table-container">
			<table id="comments" class="table table-striped table-bordered" style="width:100%;">
				<thead>
					<tr>
						<td>Id</td>
						<th>Título del post</th>
						<th>Email</th>
						<th>Comentario</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${comments}" var="c">
						<tr>
							<td>${c.getId()}</td>
							<td>${c.getPost().getTitle()}</td>
							<td>${c.getEmail()}</td>
							<td>${c.getBodyResume()}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="${pageContext.request.contextPath}/posts/list" class="btn btn-primary">Volver al listado</a>
		</div>
	</main>
	</div>
</body>
</html>