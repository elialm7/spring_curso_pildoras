<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css">
</head>
<body>
	Hola ${param.nombreAlumno}. bienvenido al curso de spring
	
	<p>
	
		<br>
			<h2>Atencion a todos</h2> 
			${mensajeClaro}
	
	</p>
	
	
	<img alt="foto de spring" src="${pageContext.request.contextPath}/static/img/spring_boot_image.png">
</body>
</html>