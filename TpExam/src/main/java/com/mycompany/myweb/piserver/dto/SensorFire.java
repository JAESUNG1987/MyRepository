package com.mycompany.myweb.piserver.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SensorFire {
	private int frid;
	@DateTimeFormat(pattern="yyyy-MM-dd h:mm:ss")
	private Date fdate;
	
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
