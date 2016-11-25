package com.mycompany.myweb.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Flame {
	private int fid;
	private int frid;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date fdate;
	private double fflame;	//###.# 형태로 DB에 저장됨
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getFrid() {
		return frid;
	}
	public void setFrid(int frid) {
		this.frid = frid;
	}
	public Date getFdate() {
		return fdate;
	}
	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}
	public double getFflame() {
		return fflame;
	}
	public void setFflame(double fflame) {
		this.fflame = fflame;
	}
	

}
