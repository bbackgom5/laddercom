<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include2</title>
</head>
<body>
	안녕하세요. 쇼핑몰 중심 JSP 시작입니다!!
	<br>
	<jsp:include page="abc_image.jsp"  flush="ture">
		<jsp:param name="name"  value="룰루2"  />
		<jsp:param name="imgName"  value="abc2.jpg"  />
	</jsp:include>
	<br>
	안녕하세요. 쇼핑몰 중심 JSP 끝 부분입니다..!!!
</body>
</html>