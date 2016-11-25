<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam03
		<hr/>
		[회원 가입 폼] <br/>
		<form action="/jsapp/exam03/join">
			아이디:<input type="text"name="mid" value="nara"/> <br/>
			이름:<input type="text"name="mname" value="김개똥"/> <br/>
			비밀번호:<input type="password"name="mpassword" value="54321"/> <br/>
			이메일:<input type="email"name="memail" value="nara@naver.com"/> <br/>
			전화번호:<input type="tel"name="mtel" value="010-1234-5678"/> <br/>
			직업:
				<input type="radio"name="mjob" value="대학생">대학생	
				<input type="radio"name="mjob" value="회사원">회사원
				<input type="radio"name="mjob"checked value="교육생">교육생
				<input type="radio"name="mjob" value="공무원">공무원 <br/>
			개발분야:
				<input type="checkbox"name="mskill" value="Web">웹 개발
				<input type="checkbox"name="mskill" value="System"checked>시스템 개발
				<input type="checkbox"name="mskill" value="Bigdata">빅데이터 개발
				<input type="checkbox"name="mskill" value="Game"checked>게임 개발
				<input type="checkbox"name="mskill" value="IoT"checked>IoT 개발 <br/>
			주소:
				<select name="madress1">
					<option>서울특별시</option>
					<option selected>경기도</option>
					<option>부산광역시</option>
					<option>대구광역시</option>
					<option>제주특별자치도</option>
				</select> -
				<select name="madress2">
					<option>인천시</option>
					<option>수원시</option>
					<option>용인시</option>
					<option selected>부천시</option>
					<option>의왕시</option>
					<option>시흥시</option>
				</select> <br/>
				
			생년월일: <input type="date"name="mbirth" value="2016-10-14"/>
				
				<br/>
				
				<input type="image"src="/jsapp/resources/image/join1.jpg"width="200"/>
		</form>
	</body>
</html>