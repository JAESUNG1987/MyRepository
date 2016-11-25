package ch08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Account;

public class AccountDao {
	private Connection conn;

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public int update(Account account) throws SQLException{
		String sql = "update account set abalance=? where ano=? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);		
		//여기선 트라이/캐치로 예외를 잡으면 안된다.예외를 잡으면 어떠한경우에도 예외가 나오지않는다.
		
		pstmt.setInt(1, account.getAbalance());
		pstmt.setString(2, account.getAno());
		int rowNo = pstmt.executeUpdate();
		return rowNo;
	}
}
