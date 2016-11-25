<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		[회원 가입 폼] <br/>
		<form method="post" action="/jsapp/exam04/join">
			아이디: <input type="text" name="mid" value="true"/> <br/>
			이름: <input type="text" name="mname" value="홍길동"/> <br/>
			비밀번호: <input type="password" name="mpassword" value="12345"/> <br/>
			이메일: <input type="email" name="memail" value="true@naver.com"/> <br/>
			전화번호: <input type="tel" name="mtel" value="010-1234-1234"/> <br/>
			직업: 	
				<input type="radio" name="mjob" value="대학생">대학생
				<input type="radio" name="mjob" checked value="회사원">회사원
				<input type="radio" name="mjob" value="공무원">공무원 <br/>
			개발분야: 
				<input type="checkbox" name="mskill" value="web" checked>웹 개발 
				<input type="checkbox" name="mskill" value="system" checked>시스템 개발 
				<input type="checkbox" name="mskill" value="bigdata">빅데이터 개발 	
				<input type="checkbox" name="mskill" value="iot" checked>IoT 개발 <br/>		
			주소: 
				<select name="maddress1">
					<option>서울특별시</option>
					<option selected>경기도</option>
					<option>부산광역시</option>
					<option>대구광역시</option>
					<option>제주광역시</option>
				</select>	 - 
				<select  name="maddress2">
					<option>인천시</option>
					<option>수원시</option>
					<option>용인시</option>
					<option selected>부천시</option>
					<option>의왕시</option>
				</select> <br/>
				
			생년월일: <input type="date" name="mbirth" value="2016-10-04"/>	
				
				<br/>
				
				
				<input type="submit" value="가입"/>
				
		</form>
	</body>
</html>