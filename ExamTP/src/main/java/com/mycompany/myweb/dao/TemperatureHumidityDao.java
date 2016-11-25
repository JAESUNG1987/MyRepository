package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dto.TemperatureHumidity;

@Component
public class TemperatureHumidityDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(TemperatureHumidity temperatureHumidity){
		/////////////////////////
		// 구동 정상 확인
		/////////////////////////
		String sql = "insert into temperature_Humidity(tid, trid, tdate, ttemperature, thumidity) values (seq_temperatureHumidity_tid.nextval,?,?,?,?) ";
		int row = jdbcTemplate.update(
			sql,
			temperatureHumidity.getTrid(),
			temperatureHumidity.getTdate(),
			temperatureHumidity.getTtemperature(),
			temperatureHumidity.getThumidity()
		);
		return row;
	}

	
	public int delete(int tid){
		String sql = "delete from temperature_Humidity where=tid ";
		int row = jdbcTemplate.update(sql,tid);
		return row; 
	}
	
	public TemperatureHumidity selectByTrid(int trid){
		String sql = "select tid, trid, tdate, ttemperature, thumidity "
				   + "from ("
				   + 	"select rownum as rn, tid, trid, tdate, ttemperature, thumidity "
				   + 	"from Temperature_Humidity "
				   +	"where trid=? order by tid desc"	
				   + 	") "
				   + "where rn=1";
		List<TemperatureHumidity> list = jdbcTemplate.query(sql, new Object[] {trid}, new RowMapper<TemperatureHumidity>(){
			@Override
			public TemperatureHumidity mapRow(ResultSet rs, int row) throws SQLException {
				TemperatureHumidity temperatureHumidity = new TemperatureHumidity();
				temperatureHumidity.setTid(rs.getInt("tid"));
				temperatureHumidity.setTrid(rs.getInt("trid"));
				temperatureHumidity.setTdate(rs.getDate("tdate"));
				temperatureHumidity.setTtemperature(rs.getDouble("ttemperature"));
				temperatureHumidity.setThumidity(rs.getDouble("thumidity"));
				return temperatureHumidity;
			}
		});
		return(list.size() != 0)? list.get(0) : null;
	}
	
}
