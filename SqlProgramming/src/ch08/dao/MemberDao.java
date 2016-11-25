package ch08.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Member;


public class MemberDao {
	public void insert(Member member){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "insert into member(mid,mname,mage,mbirth) values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);	//실행준비
			pstmt.setString(1,member.getMid() );
			pstmt.setString(2, member.getMname());
			pstmt.setInt(3, member.getMage());
			pstmt.setDate(4, new Date(member.getMbirth().getTime()));		//날짜에 들어갈것은 sql데이타 임포트 sql 데이터
			//pstmt.setString(4, "1995.10.5");				//String 으로 받아서 넣어도된다.
															//익스큐트 쿼리는 데이터를 조회할때만 쓴다.
			int rowNo = pstmt.executeUpdate();				//데이타의 조작 이라생각하면됨. 테이블 변경
			if(rowNo == 1){
				System.out.println("저장 성공");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public void update(Member member){
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "update member set mage=?, mbirth=? where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);	
			pstmt.setInt(1,member.getMage() );
			pstmt.setDate(2, new Date(member.getMbirth().getTime()));
			pstmt.setString(3, member.getMid());
	
			int rowNo = pstmt.executeUpdate();				//3가지가 나올수잇다.//1이상의값(1개 이상의 행이 수정됨) // 0(어떤 행동 수정되지 않을때 // 예외가 발생
			if(rowNo >= 1){
				System.out.println(rowNo + "개의 행이 수정 성공");
			} else if(rowNo == 0){
				System.out.println("수정된 행이 없음");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("수정 실패");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}

	public void deleteByMid(String mid) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "delete member where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);	
			pstmt.setString(1, mid);	
			int rowNo = pstmt.executeUpdate();				//3가지가 나올수잇다.//1이상의값(1개 이상의 행이 삭제됨) // 0(어떤 행동 삭제되지 않을때 // 예외가 발생
			if(rowNo >= 1){
				System.out.println(rowNo + "행이 삭제됨");
			} else if(rowNo == 0){
				System.out.println("삭제된 행이 없음");
			}
			pstmt.close();
		} catch (Exception e) {
			System.out.println("삭제 실패");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
	}
}
