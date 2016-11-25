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
	로그인 폼
	<hr/>
	<form method="post">
		아이디 : <input type="text" name="mid">
		<c:if test="${err == 'LOGIN_FAIL_MID'}"> * 아이디를 잘 못 입력하셨습니다.</c:if> <br/>
		패스워드 : <input type="password" name="mpassword">
		<c:if test="${err == 'LOGIN_FAIL_MPASSWORD'}"> * 패스워드를 잘 못 입력하셨습니다.</c:if> <br/>
		<input type="submit" value="로그인">
	</form>
	<a href="${pageContext.servletContext.contextPath}/member/join">회원 가입 </a><br/>
	<a href="${pageContext.servletContext.contextPath}/member/findMid">아이디 찾기</a><br/>
	<a href="${pageContext.servletContext.contextPath}/member/findMpassword">비밀번호 찾기</a>
	

</body>
<!-- body 종료 -->
</html>
