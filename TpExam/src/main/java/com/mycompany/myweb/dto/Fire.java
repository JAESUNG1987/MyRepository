package com.mycompany.myweb.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Fire {
	private int fid;
	private int frid;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fdate;
	private long fire;	// 화재 수치 받을 필드가 없어 추가
	
	public int getFid() {
		return fid;
	}
	
	public void setFid(int fid) {
		this.fid = fid;
	}
	
	public long getFire() {
		return fire;
	}
	
	public void setFire(long fire) {
		this.fire = fire;
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
	
}
