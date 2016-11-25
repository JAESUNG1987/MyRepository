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
		/////////////////////////
		// 구동 정상 확인
		/////////////////////////
		String sql = "insert into visitor(vid, vrid, vdate, vstate) values (seq_visitor_vid.nextval,?,?,?) ";
		int row = jdbcTemplate.update(
			sql,
			visitor.getVrid(),
			visitor.getVdate(),
			visitor.isVstate()
		);
		return row;
	}
	
	public int delete(int vid) {
		String sql = "delete from visitor where vid=? ";
		int row = jdbcTemplate.update(sql,vid);
		return row; 
	}
	
	public Visitor selectByVrid(int vrid){
		String sql = "select vid, vrid, vdate, vstate "
				   + "from ("
				   + 	"select rownum as rn, vid, vrid, vdate, vstate "
				   + 	"from visitor "
				   +	"where vrid=? order by gid desc"	
				   + 	") "
				   + "where rn=1";
		List<Visitor> list = jdbcTemplate.query(sql, new Object[] {vrid}, new RowMapper<Visitor>(){
			@Override
			public Visitor mapRow(ResultSet rs, int row) throws SQLException {
				Visitor Visitor = new Visitor();
				Visitor.setVid(rs.getInt("vid"));
				Visitor.setVrid(rs.getInt("vrid"));
				Visitor.setVdate(rs.getDate("vdate"));
				Visitor.setVstate(rs.getBoolean("vstate"));
				return Visitor;
			}
		});
		return(list.size() != 0)? list.get(0) : null;
	}
	
}
