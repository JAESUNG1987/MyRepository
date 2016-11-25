package com.mycompany.myweb.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Visitor {
	private int vid;
	private int vrid;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date vdate;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
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
