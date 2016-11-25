package com.mycompany.myweb.piserver.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SensorVisitor {
	private int vrid;
	@DateTimeFormat(pattern="yyyy-MM-dd h:mm:ss")
	private Date vdate;
	
	public int getVrid() {
		return vrid;
	}
	public void setVrid(int vrid) {
		this.vrid = vrid;
	}
	public Date getVdate() {
		return vdate;
	}
	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}
	
}
