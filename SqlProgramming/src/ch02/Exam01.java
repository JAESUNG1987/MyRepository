package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//어떤 JDBC Driver를 사용할것인가(JDBC Driver 로딩)// 로딩은 Oracle JDBC 를 사용할거다.
		Class.forName("oracle.jdbc.OracleDriver");
		
		//연결 요청을 해서 연결 객체를 얻기
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl",
			"tester1","kosa12345"
		);
		
		//어떤 JDBC 에 따라 위 두개의 내용이 달라진다
		
		//SQL문을 보내고 실행시킴
		String sql = "select empno,ename from emp";
		PreparedStatement pstmt = conn.prepareStatement(sql);		//실행준비를 하겠다. 준비가 되면 준비된 객체를 얻으룻있다. 
		ResultSet rs = pstmt.executeQuery();
		
		//결과 셋에서 한 행씩 읽기
		while(rs.next()){		//현재 커서가 있는 행을 읽을 수있다. //커서를 읽고 행이있으면 트루 없으면 펄스
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			System.out.println(empno + ":" + ename);
		}
		
		//JDBC 관련 객체 닫기(메모리 리소스 해제)
		rs.close();
		pstmt.close();
		conn.close();
	}

}
