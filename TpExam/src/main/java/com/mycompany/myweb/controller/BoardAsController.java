package com.mycompany.myweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.service.BoardASService;

@Controller
@RequestMapping("/boardas")
public class BoardAsController {
	private static final Logger logger = LoggerFactory.getLogger(BoardAsController.class);
	
	private BoardASService boardAsService;
	
	@RequestMapping("/list")	
	public String boardas() {
		logger.info("■CTL■ boardas 페이지 호출");
		return "boardas/list";
	}
}
