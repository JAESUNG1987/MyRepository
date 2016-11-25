<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<!-- head 시작 -->
<head>
	<title>Spectro Team Project</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<link href="<%=pageContext.getServletContext().getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<script type="text/javascript" src="<%=pageContext.getServletContext().getContextPath()%>/resources/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="<%=pageContext.getServletContext().getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	
	<!-- ★추가 CSS 넣는곳 곳 / 시작 -->
	<link href="<%=pageContext.getServletContext().getContextPath()%>/resources/css/jumbotron-narrow.css" rel="stylesheet">
	<style type="text/css">
	
	</style>
	<!-- ★추가 CSS 넣는 곳 / 종료 -->	
	<!-- ★추가 자바 스크립트 넣는 곳 / 시작 -->
	<script type="text/javascript">
		
	</script>
	<!-- ★추가 자바 스크립트 넣는 곳 / 종료 -->	
</head>
<!-- head 종료 -->
<!-- body 시작 -->
<body style="background-image: url(<%=pageContext.getServletContext().getContextPath()%>/resources/image/pattern.jpg)" >
	회원 정보
	<hr/>
	
	<form method="post">
	
		<table style="border-collapse: collapse; border: 1px solid black">
			<tr>
				<td style="border: 1px solid black; background-color:orange; width:70px">아이디</td>
				<td style="border: 1px solid black">${member.mid}</td>
			</tr>
			<tr>
				<td style="border: 1px solid black; background-color:orange; width:70px">이름</td>
				<td style="border: 1px solid black">${member.mname}</td>
			</tr>
			<tr>
				<td style="border: 1px solid black; background-color:orange; width:70px">비밀번호</td>
				<td><input type="password" name="mpassword" style="width: 600px;" value="${member.mpassword}"/></td>
			</tr>
			<tr>
				<td style="border: 1px solid black; background-color:orange; width:70px">이메일</td>
				<td><input type="email" name= "memail" style="width: 600px;" value="${member.memail}"/></td>
			</tr>
			<tr>
				<td style="border: 1px solid black; background-color:orange; width:70px">주소</td>
				<td><input type="text" name="maddress" style="width: 600px;" value="${member.maddress}"></td>
			</tr>
			<tr>
				<td style="border: 1px solid black; background-color:orange; width:70px">전화번호</td>
				<td><input type="text" name="mtel" style="width: 600px;" value="${member.mtel}"></td>
			</tr>
		</table>
		<input type="submit" value="수정">
	</form>
</body>
<!-- body 종료 -->
</html>
