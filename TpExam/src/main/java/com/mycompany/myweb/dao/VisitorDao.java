package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dto.Visitor;

@Component
public class VisitorDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Visitor visitor){
		String sql = "insert into visitor(vid, vrid, vdate) values (seq_visitor_vid.nextval,?,sysdate) ";
		int row = jdbcTemplate.update(
			sql,
			visitor.getVrid()
		);
		return row;
	}
	
	public int delete(int vid) {
		String sql = "delete from visitor where vid=? ";
		int row = jdbcTemplate.update(sql,vid);
		return row; 
	}
	
	public Visitor selectByVid(int vid){
		String sql = "select vid, vrid, vdate from visitor where vid=? ";
		List<Visitor> list = jdbcTemplate.query(sql, new Object[] {vid}, new RowMapper<Visitor>(){
			@Override
			public Visitor mapRow(ResultSet rs, int row) throws SQLException {
				Visitor visitor = new Visitor();
				visitor.setVid(rs.getInt("vid"));
				visitor.setVrid(rs.getInt("vrid"));
				visitor.setVdate(rs.getDate("vdate"));
				return visitor;
			}
		});
		return(list.size() != 0)? list.get(0) : null;
	}
	
}
