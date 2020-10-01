<%@page import="java.util.ArrayList"%>
<%@page import="m02aula06.basica.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>
	<%
	ArrayList<Cliente> lista = (ArrayList<Cliente>) request.getAttribute("clientes");
	for(int i=0; i<lista.size(); i++){
		out.println(lista.get(i).getCpf() + "<br/>");
		out.println(lista.get(i).getNome() + "<br/>");
		out.println(lista.get(i).getEmail() + "<br/>");
		out.println(lista.get(i).getDataNascimento() + "<br/>");
		out.println(lista.get(i).getSexo() + "<br/>");
		out.println(lista.get(i).getNomeSocial() + "<br/>");
		out.println(lista.get(i).getApelido() + "<br/>");
		out.println(lista.get(i).getTelefone() + "<br/>");
		out.println(lista.get(i).getEndereco() + "<br/>");
	}
	%>
</body>
</html>