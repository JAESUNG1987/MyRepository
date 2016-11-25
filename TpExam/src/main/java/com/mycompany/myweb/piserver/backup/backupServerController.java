package com.mycompany.myweb.piserver.backup;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myweb.piserver.dto.SensorDHT11;

//@Controller
//@RequestMapping("/piserver")
public class backupServerController {	
	private static final Logger logger = LoggerFactory.getLogger(backupServerController.class);
	
/*	@RequestMapping(value="/acceptdht11", method=RequestMethod.GET)
	//public void AcceptDHT11(String trid, String tdate, String ttemperature, String thumidity, HttpServletResponse response) throws Exception {
	public void AcceptDHT11(String trid, String ttemperature, String thumidity, HttpServletResponse response) throws Exception {
	//public void AcceptDHT11(SensorDHT11 dht11, HttpServletResponse response) throws Exception {
		logger.info("- [온도/습도] ------------------");  
		logger.info("■룸id : " + trid);
		logger.info("■룸온도 : " + ttemperature);
		logger.info("■룸습도 : " + thumidity);
		logger.info("--------------------------------");

		logger.info("--------------------------------");
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}*/
	
/*	@RequestMapping(value="/acceptdht11", method=RequestMethod.POST)
	public void AcceptDHT11Post(String trid, String tdate, String ttemperature, String thumidity, HttpServletResponse response) throws Exception {
		logger.info("--------------------------------");
		logger.info("■CTL■ /piserver/dht11 호출! ");
		logger.info("■룸id : " + trid);
		logger.info("■날짜 : " + tdate);
		logger.info("■룸온도 : " + ttemperature);
		logger.info("■룸습도 : " + thumidity);
		logger.info("--------------------------------");
		
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}*/

/*
	@RequestMapping(value="/acceptgas", method=RequestMethod.GET)
	public void AcceptGas(SensorGas gas, HttpServletResponse response) throws Exception {
		logger.info("- [가스 누출] ------------------");
		logger.info("■ Room : " + gas.getGrid() );
		logger.info("■ 발생시간 : " + gas.getGdate() );
		logger.info("--------------------------------");
		
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}
	
	@RequestMapping(value="/acceptfire", method=RequestMethod.GET)
	public void AcceptFire(SensorFire fire, HttpServletResponse response) throws Exception {
		logger.info("- [화재 발생] ------------------");
		logger.info("■ Room : " + fire.getFrid() );
		logger.info("■ 발생시간 : " + fire.getFdate() );
		logger.info("--------------------------------");
		
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}

	@RequestMapping(value="/acceptvisitor", method=RequestMethod.GET)
	public void AcceptVisitor(SensorVisitor visitor, HttpServletResponse response) throws Exception {
		logger.info("- [방문자 발생] ----------------");
		logger.info("■ Room : " + visitor.getVrid() );
		logger.info("■ 발생시간 : " + visitor.getVdate() );
		logger.info("--------------------------------");
		
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}*/
}
