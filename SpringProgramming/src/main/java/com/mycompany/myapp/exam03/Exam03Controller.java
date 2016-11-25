package com.mycompany.myapp.exam03;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam03Controller.class);
	
	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청처리");
		return "/exam03/index";
	}
	
	@RequestMapping("/join")
	public String join(Member member){		//커맨드 객체
		logger.info("join 요청처리");
		logger.info("mid: " + member.getMid());
		logger.info("mname: " + member.getMname());
		logger.info("mpassword: " + member.getMpassword());
		logger.info("memail: " + member.getMemail());
		logger.info("mtel: " + member.getMtel());
		logger.info("mjob: " + member.getMjob());
		logger.info("mskil: " + Arrays.toString(member.getMskill()));
		logger.info("madress1: " + member.getMadress1());
		logger.info("madress2: " + member.getMadress2());
		logger.info("mbirth: " + member.getMbirth());
		return "/exam03/index";
	}

}
