<%@ include file="header.jsp" %>
<body>
	<div class="container">
		<h1 class="text-center">Novo Contato</h1>
		<form class="col-md-6 col-md-offset-3 well" action="${pageContext.request.contextPath}/contato.salvar" method="post">
			<div class="form-group">
				<label>Nome</label>
				<input type="text" name="nome" class="form-control">
			</div>
			<div class="form-group">
				<label>Telefone</label>
				<input type="text" name="telefone" class="form-control">
			</div>
			<div class="form-group">
				<label>E-mail</label>
				<input type="text" name="email" class="form-control">
			</div>
			<input type="submit" value="Enviar" class="btn btn-primary btn-block">
		</form>
	</div>
<%@ include file="footer.jsp" %>