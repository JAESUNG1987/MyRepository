package com.mycompany.myweb.piserver.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SensorGas {
	private int grid;
	@DateTimeFormat(pattern="yyyy-MM-dd h:mm:ss")
	private Date gdate;
	
	public int getGrid() {
		return grid;
	}
	public void setGrid(int grid) {
		this.grid = grid;
	}
	public Date getGdate() {
		return gdate;
	}
	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}
	
}
