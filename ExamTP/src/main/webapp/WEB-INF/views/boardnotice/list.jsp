<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<HTML>
<!-- head 시작 -->
<HEAD>
	<title>Spectro Team Project</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- ================ 필수 연결 / 시작 ================ -->	
	<link href="<%=pageContext.getServletContext().getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<script type="text/javascript" src="<%=pageContext.getServletContext().getContextPath()%>/resources/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="<%=pageContext.getServletContext().getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	<!-- ================ 필수 연결 / 종료 ================ -->
	<!-- ================ CAPS 관련 CSS&JS / 시작 ================ -->
	<LINK href="<%=pageContext.getServletContext().getContextPath()%>/resources/capscss/default.css" rel="stylesheet" type="text/css">
	<LINK href="<%=pageContext.getServletContext().getContextPath()%>/resources/capscss/common.css" rel="stylesheet" type="text/css">
	<LINK href="<%=pageContext.getServletContext().getContextPath()%>/resources/capscss/gnb.css" rel="stylesheet" type="text/css">
	<LINK href="<%=pageContext.getServletContext().getContextPath()%>/resources/capscss/subpage.css" rel="stylesheet" type="text/css">
	<SCRIPT src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsjs/jquery.cookie.js" type="text/javascript"></SCRIPT>
	<SCRIPT src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsjs/jquery.ulslide.js" type="text/javascript"></SCRIPT>
	<SCRIPT src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsjs/placeholder.js" type="text/javascript"></SCRIPT>
	<SCRIPT src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsjs/publish.js" type="text/javascript"></SCRIPT>
	<!-- 사용자 함수 모음-->
	<SCRIPT src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsjs/adt_func.js" type="text/javascript"></SCRIPT>
	<!-- ================ CAPS 관련 CSS&JS / 종료 ================ -->
	<!-- ================ ★추가 CSS 넣는곳 곳 / 시작 ================ --> 
	<!-- jumbotron-narrow -->
	<link href="<%=pageContext.getServletContext().getContextPath()%>/resources/css/jumbotron-narrow.css" rel="stylesheet">
	<!-- 개발자 정의 -->
	<style type="text/css">

	
	</style>
	<!-- ================ ★추가 CSS 넣는곳 곳 / 종료 ================ -->
	<!-- ================ ★추가 자바 스크립트 넣는 곳 / 시작 ================ -->	
	<script type="text/javascript">

	</script>
	<!-- ================ ★추가 자바 스크립트 넣는 곳 / 종료 ================ -->
</HEAD>
<!-- head 종료 -->
<!-- body 시작 -->
<BODY>
	<div>
		<form action="/myweb/boardnotice/list">

			<!--2015.08.06 이미지를 텍스트로변경-->
			<h2>공지 사항</h2>

			<fieldset class="srch">
				<legend>검색영역</legend>
				<input name="search" title="검색어" class="btitle" accesskey="s"
					type="text" placeholder="Search" value="" /> 
				<input
					type="image" alt="검색" src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/css/src_icon.png"> <span></span>
			</fieldset>
		</form>
		<!--공지사항 내용시작-->
		<table class="tb0_style">
			<caption>공지사항</caption>
			<colgroup>
				<col style="width: 100px">
				<col>
				<col style="width: 120px;">
			</colgroup>

			<thead>
				<tr>
					<th style="text-align: center;">번호</th>
					<th style="text-align: center;">제목</th>
					<th style="text-align: center;">등록일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="freeBoard" items="${list}">
				<tr>
					<td>${freeBoard.bno}</td>
					<td><a href="info?bno=${freeBoard.bno}">${freeBoard.btitle}</a></td>
					<td>${freeBoard.bdate}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="paginate01">
            <a style="width:24px; height:26px;" class="direction prevp" href="list?pageNo=1"></a>
            <c:if test="${groupNo>1}">
            <a style="width:24px; height:26px;" class="direction prev" href="list?pageNo=${startPageNo-1}"></a>
            </c:if>
            
            <c:forEach var="i" begin="${startPageNo}" end="${endPageNo}">
            <a style="width:24px; height:26px;" href="list?pageNo=${i}"  <c:if test="${pageNo==i}"> class="active"</c:if> >
            ${i}</a>
            </c:forEach>
                        
            <c:if test="${groupNo<totalGroupNo}">
            <a style="width:24px; height:26px;" class="direction next" style="width:30px; height:30px;" href="list?pageNo=${endPageNo+1}"></a>
            </c:if>
            <a style="width:24px; height:26px;" class="direction nextn" style="width:30px; height:30px;" href="list?pageNo=${totalPageNo}"></a>
            
         </div>
         
		<!--공지사항리스트 내용끝-->
	
	</div>
</BODY>
<!-- body 종료 -->
</HTML>
