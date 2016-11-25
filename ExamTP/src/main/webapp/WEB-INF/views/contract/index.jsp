<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
	
	html,body,div,ul,ol,li,dt,dd,dl,h1,h2,h3,h4,h5,table,th,td,form,fieldset,legend,textarea,button,select,blockquote,strong,xmp{padding:0; margin:0;}
	ul,ol{list-style:none;}
	legend,caption{display:none;}
	img,fieldset{border:0;}
	
	#contract li{border:1px solid red; width:100px; height:50px;}
		
	#wrap { position:fixed; top:0px; left:0px; width:100%; height:100%; 
				min-width: 1400px; min-height: 780px; 
				background-image: url("<%=pageContext.getServletContext().getContextPath()%>/resources/image/bg_morning.jpg");
				background-size: cover; transition: all 2s;
		}
		
		#wrap h1{width:90px; height:80px;  top:30px; left:60px; 
				 background-image: url("<%=pageContext.getServletContext().getContextPath()%>/resources/image/logo_b.png"); 
				 background-size: contain; background-repeat: no-repeat;
		}
		
		header{width:100%; overflow:hidden;}
		header>h1{float:left; margin:20px;}
		.mDiv{height:600px;}
		
		/* 주메뉴 */
		
		#gnb {margin:27px 80px 30px 0; float:right; overflow:hidden;}
		#gnb li { float: left; margin-left: 30px; }
		#gnb li a { font-size: 14px; font-weight: bold; color: #555; }
		
		/* 텍스트 박스*/
		article { position: absolute; top: 300px; left: 150px; width: 500px;}
		article p { font-size: 50px; color: #666; }
		article p strong {color: #111; }
		article em {font-size: 15px; font-style: italic; color: #333;}
		
		/* 푸터 */
		footer { position: absolute; bottom: 20px; width: 100%; height: 20px; color: white;}
		
	</style>
	<!-- ★추가 CSS 넣는 곳 / 종료 -->	
	<!-- ★추가 자바 스크립트 넣는 곳 / 시작 -->
	<script type="text/javascript">

		$(function() {
			console.log($("#contract").val());
		});
	
	
	</script>
	<!-- ★추가 자바 스크립트 넣는 곳 / 종료 -->	
</head>
<!-- head 종료 -->
<!-- body 시작 -->
<body style="background-image: url(<%=pageContext.getServletContext().getContextPath()%>/resources/image/pattern.jpg)" >

<div id="wrap">
		<header>
			<!-- 로고 시작 -->
			<h1></h1>
			<!-- 로고 종료 -->
			
			<!-- 주 메뉴 시작 -->
			
			<ul id="gnb">
				<li><a href="#">Home</a></li>
				<c:if test="${login == null}">
					<li><a id="myBtn" data-toggle="modal" href="#myModal">login</a></li>
				</c:if>
				<c:if test="${login != null}">
					<li><a href="${pageContext.servletContext.contextPath}/member/logout">logout</a></li>
				</c:if>
				<c:if test="${login != null}">
					<li><a href="${pageContext.servletContext.contextPath}/member/info">memberInfo</a></li>
				</c:if>
				<li><a href="${pageContext.servletContext.contextPath}/boardnotice/list">Boardnotice</a></li>
				<c:if test="${login != null}">
					<li><a href="${pageContext.servletContext.contextPath}/room/roomList">roomList</a></li>
				</c:if>
				
			</ul>
		</header>
		<!-- 주 메뉴 종료 -->
	
	      <div>
			<div class="col-lg-3" class="mDiv">
				<c:if test="${mList != null}">
					<ul>
						<c:forEach var="member" items="${mList}" >
							<li>계약자 정보 : ${member.mid}</li>
						</c:forEach>
<%-- 						<li>계약자 정보 : ${member.mname}</li> --%>
<%-- 						<li>계약자 이름 : ${member.maddress}</li> --%>
<%-- 						<li>계약자 주소 : ${member.mtel}</li> --%>
					</ul>			
				</c:if>
			</div>
			<div class="col-lg-3">
				<h3>계약된 룸정보</h3>
				<c:if test="${list != null}">
					<ul>
						<c:forEach var="roomList" items="${list}" >
								<li>계약 방 이름 : ${roomList.rname}</li>
						</c:forEach>
					</ul>
				</c:if>
			</div>
			<div id="contract"  class="col-lg-3">뭐지
				<ul>
				
				<c:if test="${contract != null}">
					<li>계약된 룸 정보 : ${list.get(0).rname}</li>
					<li>온도,습도 : ${contract.ctemperature}</li>
					<li>불 :		${contract.cfire}</li>
					<li>가스 : 	${contract.cgas}</li>
					<li>카메라 : 	${contract.cview}</li>
					<li>방문자 : 	${contract.cvisitor}</li>
				</c:if>
				</ul>	
			</div>
	
	      </div>
	
	      <div class="row marketing">
	        <div class="col-lg-6">
	
	        </div>
	
	        <div class="col-lg-6">
	
	        </div>
	      </div>
		<!-- 푸터 시작 -->
		<footer>
			<p align="center">Home Security &nbsp;TPSWA 2016 Company, Inc.&copy; &nbsp;&nbsp;&nbsp;한국소프트웨어산업협회 &nbsp;서울특별시 송파구 가락동 IT 벤처 타워 12층 </p>
		</footer>
		<!-- 푸터 종료 -->
		
	</div>

</body>
<!-- body 종료 -->
</html>
