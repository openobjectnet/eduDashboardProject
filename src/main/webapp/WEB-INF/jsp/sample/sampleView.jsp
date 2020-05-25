<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>${title}</title>
</head>
<body>
	<h1>${title}</h1>
	
	<c:if test="${not empty name}">
		Hello ${name}
		
	</c:if>
	<br/>
		<c:if test="${not empty dbResult}">
		dbResult ${dbResult}
		
	</c:if>
	
</body>
</html>
