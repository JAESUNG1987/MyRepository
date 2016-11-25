<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="com.mycompany.myapp.exam07.*"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		데이터 찾기
		<hr/>
		<%-- 주석 선언없이 사용할수있는것은 request와 session이 있다. --%>
		[HttpServletRequest를 이용해서 찾기] <br/>
		데이터1: <%=(String)request.getAttribute("data1")%>	<br/>	
		<%-- 주석 (String)request.getAttribute("data1")을 <%=(String)request.getAttribute("data1")%> 여기에 저장--%>
		<%-- 하나의 값을 산출하는 코드(메소드,산출하는식) --%>
		데이터2: <%=(String)request.getAttribute("data2")%> <br/><br/>
		
		[HttpServletSession를 이용해서 찾기] <br/>
		데이터1: <%=(String)session.getAttribute("data1")%>	<br/>
		데이터2: <%=(String)session.getAttribute("data2")%> <br/><br/>
		
		[EL을 이용해서 찾기] <br/>
		데이터1: ${data1} <br/>
		<%-- 주석 순서는 request를 먼저 찾아보고 없으면 session에서 찾는다.둘다있으면 request것을 가지고온다. --%>
		데이터2: ${data2} <br/><br/>
		
		[객체의 속성(필드)값 얻기] <br/>
		<%-- <% %> 안에 코드를 실행해라 --%>
		<%Board board =(Board) request.getAttribute("board"); %>
		<%if(board != null) {%>
		번호:<%=board.getBno()%><br/>
		제목:<%=board.getTitle()%><br/>
		내용:<%=board.getContent()%><br/>
		조회수:<%=board.getHitcount()%><br/><br/>
		<%}%>
		<%--
		번호:${board.bno}<br/>
		제목:${board.title}<br/>
		내용:${board.content}<br/>
		조회수:${board.hitcount}<br/><br/>
		--%>
		<br/>
		[컬렉션 이용하기] <br/>
		<table style="border-collapse:collapse; border:1px solid black; width:600px">
			<tr style="background-color:#ffcc00">
				<td style="border: 1px solid black;">번호</td>
				<td style="border: 1px solid black;">제목</td>
				<td style="border: 1px solid black;">내용</td>
				<td style="border: 1px solid black;">조회수</td>
			</tr>
			
			<%--  
			<%List<Board>list =(List<Board>)request.getAttribute("boardlist");%>
			<%if(list != null){ %>
				<%for(Board b : list) {%>
					<tr>
					<td style="border: 1px solid black;"><%=b.getBno()%></td>
					<td style="border: 1px solid black;"><%=b.getTitle()%></td>
					<td style="border: 1px solid black;"><%=b.getContent()%></td>
					<td style="border: 1px solid black;"><%=b.getHitcount()%></td>
					</tr>
				<%}%> 
			 <%}%>
			  --%>
		
			<c:forEach var="b" items="${boardlist}">
				<tr>
					<td style="border:1px solid black;">${b.bno}</td>
					<td style="border:1px solid black;">${b.title}</td>
					<td style="border:1px solid black;">${b.content}</td>
					<td style="border:1px solid black;">${b.hitcount}</td>
				</tr>
			</c:forEach>
			
			
		</table>
	</body>
</html>