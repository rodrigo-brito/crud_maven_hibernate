<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Novo Contato</h1>
	<form action="${pageContext.request.contextPath}/contato.salvar" method="post">
		<label>Nome</label>
		<input type="text" name="nome">
		<label>Telefone</label>
		<input type="text" name="telefone">
		<input type="submit" value="send">
	</form>
</body>
</html>