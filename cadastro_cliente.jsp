<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Cliente</title>
</head>
<body>
<h1>Cadastro Cliente</h1>
<form action="ClienteController" method="POST">
	<input type="hidden" name="action" value="salvar"/>
	<label>Digite seus dados abaixo:</label><br/>
	<br/>
	Nome:<input type="text" name="nome" id="nomeComp"/><br/>
	<br/>
	Cpf:<input type="text" name="cpf" id="cpf"/><br/>
	<br/>
	Email:<input type="text" name="email" id="email"/><br/>
	<br/>
	Data de nascimento:<input type="text" name="dataNascimento" id="dataNascimento"/><br/>
	<br/>
	Sexo:<input type="text" name="sexo" id="sexo"/><br/>
	<br/>
	Nome Social:<input type="text" name="nomeSocial" id="nomeSocial"/><br/>
	<br/>
	Apelido:<input type="text" name="apelido" id="apelido"/><br/>
	<br/>
	Telefone:<input type="text" name="telefone" id="telefone"/><br/>
	<br/>
	Endereço:<input type="text" name="endereco" id="endereco"/><br/>
	<br/>
	<b><input type="submit" value="enviar"/></b>
	<input type="submit" value="Salvar"/>
</form>
</body>
</html>