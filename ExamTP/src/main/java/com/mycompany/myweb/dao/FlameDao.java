package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dto.Flame;
import com.mycompany.myweb.dto.Gas;

@Component
public class FlameDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Flame fflame){
		/////////////////////////
		// 구동 정상 확인
		/////////////////////////
		String sql = "insert into flame(fid, frid, fdate, fflame) values (seq_flame_fid.nextval, ?, ?, ?) ";
		int row = jdbcTemplate.update(
			sql,
			fflame.getFrid(),
			fflame.getFdate(),
			fflame.getFflame()
		);
		return row;
	}
	
	public int delete(int fid) {
		String sql = "delete from fflame where fid=? ";
		int row = jdbcTemplate.update(sql, fid);
		return row; 
	}
	
	public Flame selectByFrid(int frid){
		String sql = "select fid, frid, fdate, fflame "
				   + "from ("
				   + 	"select rownum as rn, fid, frid, fdate, fflame "
				   + 	"from flame "
				   +	"where frid=? order by fid desc"	
				   + 	") "
				   + "where rn=1";
		List<Flame> list = jdbcTemplate.query(sql, new Object[] {frid}, new RowMapper<Flame>(){
			@Override
			public Flame mapRow(ResultSet rs, int row) throws SQLException {
				Flame fflame = new Flame();
				fflame.setFid(rs.getInt("fid"));
				fflame.setFrid(rs.getInt("frid"));
				fflame.setFdate(rs.getDate("fdate"));
				fflame.setFflame(rs.getDouble("fflame"));
				return fflame;
			}
		});
		return(list.size() != 0)? list.get(0) : null;
	}
}
