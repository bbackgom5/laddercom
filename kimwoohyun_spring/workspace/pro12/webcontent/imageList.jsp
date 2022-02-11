<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<ul class="lst_type">
		<li>
			<span style='margin-left:200px' >이미지 </span>
			<span >이미지 이름</span>
			<span >선택하기</span>
		</li>
		<%
		for(int i=0 ; i < 10; i++){
		%>
		<li>
			<a href='#'  style='margin-left:100px'  >
				<img src='image/abc.jfif'  width='50'  height='50'  alt='lulu'  /></a>
			<a href='#'  ><strong>이미지 이름: 룰루<%=i %> </strong></a>
			<a href='#'  ><input name='chk<%=i %>'  type='checkbox'   /></a>
		</li>
		<%
		}
		%>
</body>
</html>