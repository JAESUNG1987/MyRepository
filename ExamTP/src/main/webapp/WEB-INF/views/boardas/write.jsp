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
		
	/* $(".login_btn").bind("click",function(){
        $.ajax({
            url : '/member/login',
            type: 'post',
            data : { "mid" : $("#userID").val(), "mpassword" : $("#userPW").val() },
            success : function(responseData){
                $("#ajax").remove();
                var data = JSON.parse(responseData);
                if(!data){
                    alert("존재하지 않는 ID입니다");
                    return false;
                }
                var html = '';
                html += '<div id="ajax">';
                html += '안녕하세요. '+ data.mname +"님";
                html += '</div>';
                $(".login_form").html(html);
            }
        });
    }); */
	
	</script>
	<!-- ================ ★추가 자바 스크립트 넣는 곳 / 종료 ================ -->
</HEAD>
<!-- head 종료 -->
<!-- body 시작 -->
<BODY oncontextmenu="return false">
	<INPUT id="currentID" type="hidden">	
	<SECTION id="container" style="position: fixed;">
		<!--header 시작-->
		<DIV class="header">
			<H1 class="header_logo">
				<A href="<%=pageContext.getServletContext().getContextPath()%>/">Spectro 웹관제 서비스</A>
			</H1>
			<SPAN class="header_txt">고객센터 1588-6400</SPAN>
			<DIV class="link_wrap">
				<!--<div class="link_wrap">-->
				<A href="javascript:book_mark();"><SPAN>서비스 즐겨찾기 추가</SPAN></A><A onclick="fNewWin('http://www.as82.kr/caps/','1024','768');">원격접속</A>
			</DIV>
		</DIV>
		<!--//header 끝-->
		<!--content 시작-->
			<!-- 2015.08.07 추가및 영역변경 시작-->
		<DIV class="content_area">
			<div class="content_area_scroll">
				<ul class="location">
					<li>홈</li>
					<li>A/S 문의</li>
				</ul>
				
				<div class="content_inner">
					<div class="container">
						<h1 class="well">A/S 문의</h1>
						<div class="col-lg-12 well">
							<div class="row">
								<form>
									<div class="col-sm-12">
										<div class="row">
											<div class="col-sm-6 form-group">
												<label>First Name</label> 
												<input type="text" placeholder="Enter First Name Here.." class="form-control">
											</div>
											<div class="col-sm-6 form-group">
												<label>Last Name</label> <input type="text"
													placeholder="Enter Last Name Here.." class="form-control">
											</div>
										</div>
										<div class="form-group">
											<label>Address</label>
											<textarea placeholder="Enter Address Here.." rows="3"
												class="form-control"></textarea>
										</div>
										<div class="row">
											<div class="col-sm-4 form-group">
												<label>City</label> <input type="text"
													placeholder="Enter City Name Here.." class="form-control">
											</div>
											<div class="col-sm-4 form-group">
												<label>State</label> <input type="text"
													placeholder="Enter State Name Here.." class="form-control">
											</div>
											<div class="col-sm-4 form-group">
												<label>Zip</label> <input type="text"
													placeholder="Enter Zip Code Here.." class="form-control">
											</div>
										</div>
										<div class="row">
											<div class="col-sm-6 form-group">
												<label>Title</label> <input type="text"
													placeholder="Enter Designation Here.." class="form-control">
											</div>
											<div class="col-sm-6 form-group">
												<label>Company</label> <input type="text"
													placeholder="Enter Company Name Here.." class="form-control">
											</div>
										</div>
										<div class="form-group">
											<label>Phone Number</label> <input type="text"
												placeholder="Enter Phone Number Here.." class="form-control">
										</div>
										<div class="form-group">
											<label>Email Address</label> <input type="text"
												placeholder="Enter Email Address Here.." class="form-control">
										</div>
										<div class="form-group">
											<label>Website</label> <input type="text"
												placeholder="Enter Website Name Here.." class="form-control">
										</div>
										<button type="button" class="btn btn-lg btn-info">Submit</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</DIV>
			<!-- 2015.08.07 추가및 영역변경 끝-->
			<!-- gnb 시작 -->
			<NAV class="gnb" style="background-image: url('<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/menu_bg.gif')">
				<!-- gnb 로그인 시작 -->
					<DIV class="gnb_my_info" style="background-color:white;">
						<!-- 로그인 전 개인정보 -->
						<DIV class="login_form">
							<FORM name="loginForm" method="post">
								<button type="button" class="login_btn" style="height: 70px;">로그인</button>
								<INPUT name="userID" id="userID" style="-ms-ime-mode: disabled; height:30px;" onkeyup="imeMode_check(this);" type="text" value="  "> 
								<INPUT name="password" id="userPW" onkeypress="if (event.keyCode==13){ check_login(); }" type="password" placeholder="PW를 입력해주세요" value="" style="height:30px;">
								<LABEL class="auto_login"><INPUT name="saveID" id="saveID" type="checkbox" value="chk" > <SPAN>아이디 저장</SPAN> </LABEL>
								<DIV class="find_id">
									<A href="https://www.capslive.co.kr/?cont=c17"><SPAN>아이디 찾기</SPAN></A> <SPAN>|</SPAN> <A href="https://www.capslive.co.kr/?cont=c18"><SPAN>비밀번호</SPAN></A>
								</DIV>
								
							</FORM>
						</DIV>
					</DIV>
				
				<!-- gnb 로그인 끝 -->
				<SCRIPT type="text/javascript"></SCRIPT>

				<!-- ★★★★ 메뉴 UI 부분 ★★★★ / start -->
				<UL class="gnb_menu"  style="background-color:white;">
					<!--메뉴명변경 시작-->
					<LI><A href="#">
						<SPAN>웹뷰어 보기</SPAN>
						<!-- <IMG onclick="alert('로그인이 필요합니다.');" alt="웹뷰어 보기" src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon1.png"> -->
						<IMG onclick="fNewWin('<%=pageContext.getServletContext().getContextPath()%>/piview/viewmain','1024','680');" src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon1.png">
						</A>
					</LI>
					<LI>
						<!--<A href="javascript:alert('로그인이 필요합니다.');"> -->
						<A href="<%=pageContext.getServletContext().getContextPath()%>/detail">
						<SPAN>서비스 내역</SPAN>
						<IMG src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon2.png">
						</A>
					</LI>
					<LI>
						<!-- <A href="javascript:alert('로그인이 필요합니다.');">  -->
						<A href="<%=pageContext.getServletContext().getContextPath()%>/manual">
						<SPAN>유저 매뉴얼</SPAN>
						<IMG alt="사용자 매뉴얼" src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon3.png">
						</A>
					</LI>
					<LI>
						<A href="<%=pageContext.getServletContext().getContextPath()%>/boardnotice/list">
						<SPAN>공지사항</SPAN>
						<IMG src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon4.png">
						</A>
					</LI>
					<LI>
						<!-- <A href="javascript:alert('로그인이 필요합니다.');">  -->
						<A href="<%=pageContext.getServletContext().getContextPath()%>/boardas/list">
						<SPAN>A/S 문의</SPAN>
						<IMG src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon5.png">
						</A>
					</LI>
					<LI>
						<!-- <A href="javascript:alert('로그인이 필요합니다.');">  -->
						<A href="<%=pageContext.getServletContext().getContextPath()%>/fandq">
						<SPAN>FAQ</SPAN>
						<IMG src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon6.png">
						</A>
					</LI>
					<LI class="gnb_border_bottom">
						<A href="#" onclick="fNewWin('<%=pageContext.getServletContext().getContextPath()%>/demo','592','404');">
						<SPAN>데모보기</SPAN><IMG alt="데모 보기" src="<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/main/gnb_icon7.png">
						</A>
					</LI>
					<LI class="gnb_policy">
						<A href="<%=pageContext.getServletContext().getContextPath()%>/agreement">
						<P class="gnb_terms">
						<SPAN>이용약관</SPAN>
						</P>
						</A>
					</LI>
					<LI class="gnb_policy">
						<A href="<%=pageContext.getServletContext().getContextPath()%>/privacy">
						<P class="gnb_pp">
						<SPAN>개인정보취급(처리)방침</SPAN>
						</P>
						</A>
					</LI>
				</UL>
				<!-- ★★★★ 메뉴 UI 부분 ★★★★ / end -->
				<DIV class="gnb_menu" style="height:10px; background-image: url('<%=pageContext.getServletContext().getContextPath()%>/resources/capsimages/menu_bg_line.gif')">
				</DIV>-->
			</NAV>
			<!-- gnb 끝 -->
			
		</DIV>
	</SECTION>
	<IFRAME name="hiddenfrm" width="100%" height="0" id="hiddenfrm" src="about:blank" frameborder="0"></IFRAME>
	<!-- style="display:none;" -->
	<IFRAME name="hiddenfrm2" width="100%" height="0" id="hiddenfrm2" src="about:blank" frameborder="0"></IFRAME>
	<!--<iframe src="axCheck.asp" name="hiddenfrmAx" id="hiddenfrmAx" frameborder="0" width="100%" height="1px"></iframe>-->
	<!--브라우저 닫을 때 오류 방지를 위해 크기를 지정해 줌-->
	<SCRIPT type="text/javascript">
		$(document).ready(function() {
			$('#slide2').ulslide({
				width : 2000,
				height : 1000,
				duration : 400,
				nextButton : '#slide2_next',
				prevButton : '#slide2_prev',
				effect : {
					type : 'fade', // slide or fade
					axis : 'x' // x, y
				},
				pager : '#slide2-pager a'
			});
		});
	</SCRIPT>

	<DIV id="footer_addr" style="background-color:#3C4145;" > <!--background-color:#3C4145; -->
		(주)Spectro | 서서울시 송파구 중대로 135, IT벤처타워 서관 12층 대표전화 : 1588-6400&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		© 2016 Spectro. All Rights Reserved.
	</DIV>
</BODY>
<!-- body 종료 -->
</HTML>
