package com.mycompany.jsapp.exam02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam02Controller.class);
	
	@RequestMapping("/index")
	public String index(){
		logger.info("index() 처리");
		return "exam02/index";
	}
	
	@RequestMapping("/join")
	public String join(Member member){
		logger.info("join() 처리");
		logger.info("mid: " + member.getMid());
		logger.info("mname: " + member.getMname());
		logger.info("mage: " + member.getMage());
		return "exam02/index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("id")String mid, @RequestParam("password")String mpassword){
		logger.info("login() 처리");
		logger.info("mid: " + mid);
		logger.info("mpassword: " + mpassword);		
		return "exam02/index";
	}
	
	@RequestMapping("/order")
	public String order(int pid, String pname, String pprice, String pcompany){
		logger.info("order() 처리");
		logger.info("pid: " + pid);
		logger.info("pname: " + pname);
		logger.info("pprice: " + pprice);
		logger.info("pcompany: " + pcompany);
		return "exam02/index";
	}
	
	@RequestMapping("/write")
	public String write(
			@RequestParam(defaultValue="1")int bno, 
			String btitle, 
			String bcontent, 
			@RequestParam(defaultValue="0")int bhitcount){
		logger.info("write() 처리");
		logger.info("bno: " + bno);
		logger.info("btitle: " + btitle);
		logger.info("bcontent: " + bcontent);
		logger.info("bhitcount: " + bhitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/update")
	public String update(
			@RequestParam(defaultValue="1")int bno, 
			String btitle, 
			String bcontent, 
			@RequestParam(value="count",defaultValue="0")int bhitcount){
		logger.info("update 처리");
		logger.info("bno: " + bno);
		logger.info("btitle: " + btitle);
		logger.info("bcontent: " + bcontent);
		logger.info("bhitcount: " + bhitcount);
		return "exam02/index";
	}
	
	@RequestMapping("/send")
	public String send(Board board){
		logger.info("send() 처리");
		logger.info("bno:" + board.getBno());
		logger.info("btitle:" + board.getBtitle());
		logger.info("bcontent:" + board.getBcontent());
		logger.info("bhitcount:" + board.getBhitcount());
		return "exam02/index";
	}
	
}
