<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais - Casa do Código</title>
</head>
<body>

<h1>Lista de Produtos</h1>
    <p> ${sucesso} </p>
<table border="1" >
	
	<tr >
		<td>Título</td>
		<td>Descrição</td>
		<td>Páginas</td>
	</tr>
	
	<c:forEach items="${produtos}" var="produto">
		<tr>
			<td>${produto.titulo}</td>
            <td>${produto.descricao}</td>
            <td>${produto.paginas}</td>
		</tr>
	</c:forEach>

</table>


</body>
</html>