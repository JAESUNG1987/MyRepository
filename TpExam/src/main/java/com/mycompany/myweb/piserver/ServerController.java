package com.mycompany.myweb.piserver;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/piserver")
public class ServerController {	
	private static final Logger logger = LoggerFactory.getLogger(ServerController.class);
	
	@RequestMapping(value="/acceptdht11", method=RequestMethod.POST)	
	public void AcceptPostDHT11(String trid, String ttemperature, String thumidity, HttpServletResponse response) throws Exception {
		/////////////////////////////////////////////////////////
		// 온도 습도 센서 관련    
		////////////////////////////////////////////////////////
        Date dateEventTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

		logger.info("[온도/습도-POST]"
				+ "\t" + sdf.format(dateEventTime)
                + "\t" +"Room ID : " + trid
                + "\t" + "Temperature : " + ttemperature
                + "\t" + "Humidity :" + thumidity
                );

		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}
	
	@RequestMapping(value="/acceptflame", method=RequestMethod.POST)	
	public void AcceptPostFlame(String frid, String fflame, HttpServletResponse response) throws Exception {
		////////////////////////////////////////////////////////
		// 화재 감지 센서 관련
		////////////////////////////////////////////////////////
        Date dateEventTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        
		logger.info("[화재발생-POST]"
				+ "\t" + sdf.format(dateEventTime)
                + "\t" +"Room ID : " + frid
                + "\t" +"Flame : " + fflame
				);

		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}
	
	@RequestMapping(value="/acceptgas", method=RequestMethod.POST)	
	public void AcceptPostGas(String grid, String ggas, HttpServletResponse response) throws Exception {
		////////////////////////////////////////////////////////
		// 가스 발생 센서 관련
		////////////////////////////////////////////////////////
        Date dateEventTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        
		logger.info("[가스발생-POST]"
				+ "\t" + sdf.format(dateEventTime)
                + "\t" +"Room ID : " + grid
                + "\t" +" Gas : " + ggas
				);

		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}
	
	@RequestMapping(value="/acceptutsn", method=RequestMethod.POST)	
	public void AcceptPostUTSN(String vrid, String vstate, HttpServletResponse response) throws Exception {
		////////////////////////////////////////////////////////
		// 거리감지 센서 관련
		////////////////////////////////////////////////////////
        Date dateEventTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        
		String strPrintState = (Integer.parseInt(vstate)==1)?"OPENED":"CLOSED";
		logger.info("[문조작 발생-POST]"
				+ "\t" + sdf.format(dateEventTime)
                + "\t" +"Room ID : " + vrid
				+ "\t" +"DoorState : " + strPrintState
                );

		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		pw.println("{}");
	}

}
