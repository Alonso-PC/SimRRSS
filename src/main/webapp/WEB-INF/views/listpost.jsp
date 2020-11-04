<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>El mundo de PP - Lista de Posts</title>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/listadoposts.js"></script>
    <!-- CSS Propio -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="wrapper">
	<main class="container-fluid">
		<h2 class="mb-3">Listado de posts</h2>
		<div class="table-container">
			<table id="posts" class="table table-striped table-bordered" style="width:100%;">
				<thead>
					<tr>
						<th>Id</th>
						<th>Título</th>
						<th>Usuario</th>
						<th>Comentarios</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${posts}" var="p">
						<tr>
							<td>${p.getId()}</td>
							<td>${p.getTitle()}</td>
							<td>${p.getUser().getName()}</td>
							<td>${p.getCantidadComments()}</td>
							<td>
								<a href="comments/${p.getId()}" class="btn btn-primary">Ver Comentarios</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="${pageContext.request.contextPath}/" class="btn btn-primary">Volver al inicio</a>
		</div>
	</main>
	</div>
</body>
</html>