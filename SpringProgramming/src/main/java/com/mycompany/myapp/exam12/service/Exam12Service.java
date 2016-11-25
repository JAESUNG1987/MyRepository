package com.mycompany.myapp.exam12.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam12.dao.MemberDao;
import com.mycompany.myapp.exam12.dto.Member;



@Component
public class Exam12Service {
	private static final Logger logger = LoggerFactory.getLogger(Exam12Service.class);
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private MemberDao dao;
	//주입을 받고 안받고는 공용으로 쓸거냐(주입 받아야함)여기서 사용할것이냐(주인안받아도 됨). 서비스나 dao는 주입 받음	
	public void join(Member member) {	
		Connection conn = null;
		try {
			conn = dataSource.getConnection();		//대여하는 의미
			dao.setConn(conn);
			int rowNo = dao.insert(member);
			logger.info(rowNo +  "행이 저장됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { conn.close(); } catch (SQLException e) { }		//연결을 끊는다는의미보다 반납의 의미
		}
		
	}
	
}
