package com.mycompany.myweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.dto.Contract;
import com.mycompany.myweb.dto.Member;
import com.mycompany.myweb.dto.Room;
import com.mycompany.myweb.service.ContractService;
import com.mycompany.myweb.service.MemberService;
import com.mycompany.myweb.service.RoomService;

@Controller
@RequestMapping("/contract")
public class ContractController {
	private static final Logger logger = LoggerFactory.getLogger(ContractController.class);
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private ContractService contractService;

	@RequestMapping("/index")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("login") == null) {
			return "redirect:/"; 
		}
		String loginMid = (String)session.getAttribute("login");
		logger.info(loginMid);
		Member member = memberService.info(loginMid, null);
		logger.info(member.getMlevel());
		if(!member.getMlevel().equals("user")){
			return "redirect:/";
		}
//		model.addAttribute("member", member);
		
		List<Member> mList = memberService.getMemberList();
		model.addAttribute("mList", mList);
		logger.info(String.valueOf(mList.get(0).getMid()));
		List<Room> list = roomService.roomList(mList.get(0).getMid());
		if(list != null){
			model.addAttribute("list", list);
			logger.info(String.valueOf(list.get(0).getRmid()));
			logger.info(String.valueOf(list.size()));
			Contract contract = contractService.info(list.get(0).getRid());
			if(contract != null){
			model.addAttribute("contract", contract);
			 logger.info(String.valueOf(contract.isCtemperature()));
			}
		}
		return "contract/index";
	}
}
