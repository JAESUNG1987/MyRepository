package com.mycompany.myweb.piview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/piview")
public class ViewController {	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);

	@RequestMapping("/viewmain")
	public String home() {
		logger.info("■CTL■ piview-main 메인 페이지 호출");
		return "piview/viewmain";
	}
	
}
