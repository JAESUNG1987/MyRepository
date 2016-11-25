package com.mycompany.myweb.piserver.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SensorDHT11 {
	private int trid;
	@DateTimeFormat(pattern="yyyy-MM-dd h:mm:ss")
	private Date tdate;
	private Double ttemperature;
	private Double thumidity;
	
	public int getTrid() {
		return trid;
	}
	public void setTrid(int trid) {
		this.trid = trid;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public Double getTtemperature() {
		return ttemperature;
	}
	public void setTtemperature(Double ttemperature) {
		this.ttemperature = ttemperature;
	}
	public Double getThumidity() {
		return thumidity;
	}
	public void setThumidity(Double thumidity) {
		this.thumidity = thumidity;
	}
	
}
