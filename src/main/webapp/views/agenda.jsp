<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/node_modules/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>Agenda</h1>
		<a class="btn btn-primary" href="${pageContext.request.contextPath}/views/cadastrar.jsp"><i class="glyphicon glyphicon-plus"></i> Novo Contato</a>
		<a class="btn btn-info" id="btn-editar" data-url="${pageContext.request.contextPath}/contato.editar"><i class="glyphicon glyphicon-pencil"></i> Editar</a>
		<a class="btn btn-danger" id="btn-apagar" data-url="${pageContext.request.contextPath}/contato.excluir"><i class="glyphicon glyphicon-trash"></i> Excluir</a>
		<div class="row">
			<form id="lista-contatos" class="col-md-6" action="${pageContext.request.contextPath}/contato.excluir" method="post">
				<hr>
				<table class=" well table table-striperd">
					<tr>
						<th></th>
						<th>Nome</th>
						<th>Telefone</th>
						<th></th>
					</tr>
				<c:forEach items="${contatos}" var="contato">
					<tr>
						<th><input type="radio" name="id" value="${contato.id}"></th>
						<td>${contato.nome}</td>
						<td>${contato.telefone}</td>
					</tr>
				</c:forEach>
				</table>
			</form>
		</div>
	</div>
	<script>
	(function() {
		var btnApagar = document.querySelector('#btn-apagar');
		var btnEditar = document.querySelector('#btn-editar');
		var atualizaAction = function(event){
			event.preventDefault();
			var url = this.getAttribute("data-url");
			var form = document.querySelector("#lista-contatos");
			form.setAttribute('action', url);
			form.submit();
		};
		btnApagar.addEventListener("click", atualizaAction);
		btnEditar.addEventListener("click", atualizaAction);
	})();
	</script>
</body>
</html>