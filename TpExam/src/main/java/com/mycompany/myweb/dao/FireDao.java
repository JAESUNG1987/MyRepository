package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dto.Fire;
import com.mycompany.myweb.dto.Gas;

@Component
public class FireDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Fire fire){
		String sql = "insert into fire(fid, frid, fdate, fire) values (seq_fire_fid.nextval, ?, sysdate, ?) ";
		int row = jdbcTemplate.update(
			sql,
			fire.getFrid(),
			fire.getFire()
		);
		return row;
	}
	
	public int delete(int fid) {
		String sql = "delete from fire where fid=? ";
		int row = jdbcTemplate.update(sql, fid);
		return row; 
	}
	
	public Fire selectByFrid(int frid){
		String sql = "select fid, frid, fdate, fire "
				   + "from ("
				   + 	"select rownum as rn, fid, frid, fdate, fire "
				   + 	"from fire "
				   +	"where frid=? order by fid desc"	
				   + 	") "
				   + "where rn=1";
		List<Fire> list = jdbcTemplate.query(sql, new Object[] {frid}, new RowMapper<Fire>(){
			@Override
			public Fire mapRow(ResultSet rs, int row) throws SQLException {
				Fire fire = new Fire();
				fire.setFid(rs.getInt("fid"));
				fire.setFrid(rs.getInt("frid"));
				fire.setFdate(rs.getDate("fdate"));
				fire.setFire(rs.getLong("fire"));
				return fire;
			}
		});
		return(list.size() != 0)? list.get(0) : null;
	}
}
