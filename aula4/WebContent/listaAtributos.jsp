<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cliente</title>
</head>
<body>

	<h3>Lista de atributos cadastrados</h3>
	
	<%String req = (String)request.getAttribute("flu1"); %>
	Request: <%=req %> <br>
	
	<%String ses = (String)session.getAttribute("flu2"); %>
	Session: <%=ses %> <br>
	
	<%String app = (String)application.getAttribute("flu3"); %>
	Application: <%=app %> <br>
	
	<br>
	<a href="index.html">Menu</a>
	
</body>
</html>