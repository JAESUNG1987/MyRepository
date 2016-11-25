package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {	
		//연결 객체 만들기
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
		
		//매게 변수화된 SQL문
		String sql = "select ename,empno,sal from emp where ename like ?";		//? 자리에 값이들어오는데 무엇이 들어올지 모른다. 
																		//문자열 전체를 ?로 해도되지만 일부를 물음표를 처리할수없다.
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%성%");		//?의 몇번째것을 넣겟느냐 첫번째는 1로 한다.
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			int empno = rs.getInt(2);
			String ename = rs.getString("ename");
			int sal = rs.getInt("sal");
			System.out.println(empno + ":" + ename + ":" + sal);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
	}
}
