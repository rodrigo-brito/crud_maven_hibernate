<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/node_modules/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>Novo Contato</h1>
		<form class="col-md-6 well" action="${pageContext.request.contextPath}/contato.salvar" method="post">
			<div class="form-group">
				<label>Nome</label>
				<input type="text" name="nome" class="form-control">
			</div>
			<div class="form-group">
				<label>Telefone</label>
				<input type="text" name="telefone" class="form-control">
			</div>
			<input type="submit" value="Enviar" class="btn btn-primary btn-block">
		</form>
	</div>
</body>
</html>