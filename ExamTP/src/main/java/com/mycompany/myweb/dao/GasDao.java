package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dto.Gas;

@Component
public class GasDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Gas gas){
		/////////////////////////
		// 구동 정상 확인
		/////////////////////////
		String sql = "insert into gas(gid, grid, gdate, ggas) values (seq_gas_gid.nextval, ?, ?, ?) ";
		int row = jdbcTemplate.update(
			sql,
			gas.getGrid(),
			gas.getGdate(),
			gas.getGgas()
		);
		return row;
	}
	
	public int delete(int gid) {
		String sql = "delete from gas where gid=? ";
		int row = jdbcTemplate.update(sql,gid);
		return row; 
	}
	
	public Gas selectByGrid(int grid){
		String sql = "select gid, grid, gdate, ggas "
				   + "from ("
				   + 	"select rownum as rn, gid, grid, gdate, ggas "
				   + 	"from gas "
				   +	"where grid=? order by gid desc"	
				   + 	") "
				   + "where rn=1";
		List<Gas> list = jdbcTemplate.query(sql, new Object[] {grid}, new RowMapper<Gas>(){
			@Override
			public Gas mapRow(ResultSet rs, int row) throws SQLException {
				Gas gas = new Gas();
				gas.setGid(rs.getInt("gid"));
				gas.setGrid(rs.getInt("grid"));
				gas.setGdate(rs.getDate("gdate"));
				gas.setGgas(rs.getDouble("ggas"));
				return gas;
			}
		});
		return(list.size() != 0)? list.get(0) : null;
	}
	
}
