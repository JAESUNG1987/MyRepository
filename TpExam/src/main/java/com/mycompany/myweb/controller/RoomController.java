package com.mycompany.myweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.dto.Fire;
import com.mycompany.myweb.dto.Gas;
import com.mycompany.myweb.dto.Member;
import com.mycompany.myweb.dto.Room;
import com.mycompany.myweb.dto.TemperatureHumidity;
import com.mycompany.myweb.service.FireService;
import com.mycompany.myweb.service.GasService;
import com.mycompany.myweb.service.MemberService;
import com.mycompany.myweb.service.RoomService;
import com.mycompany.myweb.service.TemperatureHumidityService;

@Controller
@RequestMapping("/room")
public class RoomController {
	private static final Logger logger = LoggerFactory.getLogger(RoomController.class);

	
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private GasService gasService;
	
	@Autowired
	private FireService fireService;
	
	@Autowired
	private TemperatureHumidityService temperatureHumidityService;
	
	@RequestMapping("/roomList")
	public String roomList(HttpSession session, Model model){
		String rmid = (String) session.getAttribute("login");
		List<Room> list = roomService.roomList(rmid);
		model.addAttribute("list", list);
		return "/room/roomList";
	}
	
	@RequestMapping("/roomInfo")
	public String roomInfo(int rid, Model model){
		Room room = roomService.info(rid);
		logger.info("mid : " + room.getRmid());
		
		Member member = memberService.getMember(room.getRmid());
		Gas gas = gasService.info(rid);	
		logger.info("gas : " + gas.getGas());
		
		Fire fire = fireService.info(rid);
		logger.info("fire : " + fire.getFire());
		
		TemperatureHumidity th = temperatureHumidityService.info(rid);
		logger.info("temperature : " + th.getTtemperature());
		logger.info("humidity : " + th.getThumidity());
		
		model.addAttribute("room", room);
		model.addAttribute("member", member);
		model.addAttribute("gas", gas);
		model.addAttribute("fire", fire);
		model.addAttribute("th", th);
		return "/room/roomInfo";
	}
	
}
