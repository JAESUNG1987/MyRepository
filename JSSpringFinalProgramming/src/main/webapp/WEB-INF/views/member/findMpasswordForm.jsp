<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		비밀번호 찾기
		<hr/>
		<form method="post">
			아이디: <input type="text"name="mid"/> ${error}<br/>
			이메일: <input type="email"name="memail"/><br/>
			<input type= "submit" value="찾기"/>
		</form>
	</body>
</html>