package com.mycompany.myweb.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Gas {
	private int gid;
	private int grid;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date gdate;
	private double ggas;	//###.# 형태로 DB에 저장됨
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
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
	public double getGgas() {
		return ggas;
	}
	public void setGgas(double ggas) {
		this.ggas = ggas;
	}
	
	
	
}
