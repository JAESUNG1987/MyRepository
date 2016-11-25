package com.mycompany.myweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.service.MemberService;

@Controller
public class HomeController {	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		logger.info("■CTL■ index 페이지 호출");
		return "index";
	}
	
	@RequestMapping("/detail")
	public String detail() {
		logger.info("■CTL■ detail 페이지 호출");
		return "detail";
	}

	@RequestMapping("/manual")
	public String manual() {
		logger.info("■CTL■ manual 페이지 호출");
		return "manual";
	}
	
	/*@RequestMapping("/boardas")
	public String boardas() {
		logger.info("■CTL■ boardas 페이지 호출");
		return "boardas";
	}*/
	
	@RequestMapping("/fandq")
	public String fandq() {
		logger.info("■CTL■ fandq 페이지 호출");
		return "fandq";
	}
	
	@RequestMapping("/demo")
	public String demo() {
		logger.info("■CTL■ demo 페이지 호출");
		return "demo";
	}
	
	@RequestMapping("/agreement")
	public String agreement() {
		logger.info("■CTL■ agreement 페이지 호출");
		return "agreement";
	}
	
	@RequestMapping("/privacy")
	public String privacy() {
		logger.info("■CTL■ privacy 페이지 호출");
		return "privacy";
	}

}
