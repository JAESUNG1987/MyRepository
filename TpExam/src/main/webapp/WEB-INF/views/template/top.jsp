<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<!-- head 시작 -->
<head>
<title>Spectro Team Project</title>
<meta charset="utf-8">

<!-- 추가 플러그인 -->
<link
	href="<%=pageContext.getServletContext().getContextPath()%>/resources/css/style.css"
	rel="stylesheet" />

<!-- ★추가 CSS 넣는곳 곳 / 시작 -->
<style type="text/css">
body {
	padding-top: 60px;
}

.navbar {
	min-height: 60px !important
}

.navbar-fixed-top>.container {
	margin-bottom: 0;
}

.navbar-brand {
	height: 60px;
	padding: 20px 15px;
	font-family: orbitron;
	font-size: 1.6em;
}

.navbar-nav>li>a {
	padding-top: 20px !important;
	padding-bottom: 20px !important;
	font-family: orbitron;
	font-size: 1.4em;
}

/* header */
</style>
<!-- ★추가 CSS 넣는 곳 / 종료 -->

<!-- ★추가 자바 스크립트 넣는 곳 / 시작 -->
<script type="text/javascript">
	/* 모달  */
	$(document).ready(function() {
		$("#myBtn").click(function() {
			$("#myModal").modal();
		});
	});
</script>
<!-- ★추가 자바 스크립트 넣는 곳 / 종료 -->
</head>
<!-- head 종료 -->
<!-- body 시작 -->
<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">메뉴열기</span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>

				<a class="navbar-brand" href="#">logo</a>
			</div>
			<div class="collapse navbar-collapse" id="gnb">

				<ul class="nav navbar-nav">
					<li><a class="active" href="#">Home</a></li>
					<c:if test="${login == null}">
						<li><a id="myBtn" data-toggle="modal" href="#myModal">login</a></li>
					</c:if>
					<c:if test="${login != null}">
						<li><a
							href="${pageContext.servletContext.contextPath}/member/logout">logout</a></li>
					</c:if>
					<c:if test="${login != null}">
						<li><a
							href="${pageContext.servletContext.contextPath}/member/info">memberInfo</a></li>
					</c:if>
					<li><a
						href="${pageContext.servletContext.contextPath}/boardnotice/list">Boardnotice</a></li>
					<c:if test="${login != null}">
						<li><a
							href="${pageContext.servletContext.contextPath}/room/roomList">roomList</a></li>
					</c:if>

				</ul>
			</div>
		</div>
	</div>

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">로그인</h4>
				</div>
				<div class="modal-body">
					<form role="form" method="post"
						action="${pageContext.servletContext.contextPath}/member/login">
						<fieldset>
							<div class="form-group">
								<label for="user_id">아이디</label> <input type="text" id="user_id"
									name="mid" class="form-control" placeholder="아이디를 입력하세요.">
							</div>

							<div class="form-group">
								<label for="user_pw">비밀번호</label> <input type="text"
									id="user_pw" name="mpassword" class="form-control"
									placeholder="비밀번호를 입력하세요.">
							</div>
							<c:if test="${err == 'LOGIN_FAIL_MID'}">
								<span class="help-block">아이디를 잘 못 입력하셨습니다.</span>
							</c:if>
							<c:if test="${err == 'LOGIN_FAIL_MPASSWORD'}">
								<span class="help-block">비밀번호를 잘못 입력하셨습니다.</span>
							</c:if>

							<button type="submit" class="btn btn-primary">로그인</button>
							<button type="button" class="btn btn-warning"
								data-dismiss="modal">취소</button>
						</fieldset>
					</form>
				</div>
				<!-- <div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div> -->
			</div>
		</div>
	</div>
</body>
<!-- body 종료 -->
</html>
