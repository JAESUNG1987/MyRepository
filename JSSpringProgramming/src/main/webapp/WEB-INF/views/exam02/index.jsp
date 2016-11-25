<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam02
		<hr/>
		<a href="/jsapp/exam02/join?mid=user1&mname=홍길동&mage=30">가입</a><br/>
		<a href="/jsapp/exam02/login?id=user1&password=12345">로그인</a><br/>
		<a href="/jsapp/exam02/order?pid=5&pname=마우스&pprice=5000&pcompany=삼성">주문</a><br/>
		<a href="/jsapp/exam02/write?bno=10&btitle=게시물제목&bcontent=게시물내용">글쓰기</a><br/>
		<a href="/jsapp/exam02/update?bno=10&btitle=게시물제목&bcontent=게시물내용&bcount=3">글수정</a><br/>
		<a href="/jsapp/exam02/send?bno=20&btitle=게시물제목&bcontent=게시물내용&bhitcount=5">보내기</a><br/>
	</body>
</html>