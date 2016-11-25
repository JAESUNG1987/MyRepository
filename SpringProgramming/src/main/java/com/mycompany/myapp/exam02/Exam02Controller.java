package com.mycompany.myapp.exam02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam02Controller.class);
	
	@RequestMapping("/index")
	public String index(){
		logger.info("index  요청 처리");
		return "exam02/index";
	}
	
	/*@RequestMapping("/join")
	public String join(String mid,String mname,String mage){
		logger.info("join  요청 처리");
		logger.info("mid:" + mid );
		logger.info("mname:" + mname );
		logger.info("mage:" + mage );
		return "exam02/index";
	}*/
	
	@RequestMapping("/join")
	public String join(Member member){
		logger.info("join  요청 처리");
		logger.info("mid:" + member.getMid());
		logger.info("mname:" + member.getMname());
		logger.info("mage:" + member.getMage() );
		return "exam02/index";
	}
	
	@RequestMapping("/login")
	public String login(
			@RequestParam("id")String mid,	//다른이름으로 넘어오면 리퀘스트파람을 해야한다. value="id"인데 value=는 생략
			@RequestParam("password")String mpassword){
		logger.info("login  요청 처리");
		logger.info("mid:" + mid );
		logger.info("mpassword:" + mpassword );
		return "exam02/index";
	}
	
	@RequestMapping("/order")
	public String order(int pid,String pname,String pprice,String pcompany){
		logger.info("order  요청 처리");
		logger.info("pid:" + pid );
		logger.info("pname:" + pname );
		logger.info("pprice:" + pprice );
		logger.info("pcompany:" + pcompany );
		return "exam02/index";
	}
	
	@RequestMapping("/write")
	public String writer(
			@RequestParam(defaultValue="1")int bno, 
			String title, 
			String content, 
			@RequestParam(defaultValue="0")int hitcount){
		
		//널을 인트로 바꿀수없어 에러가뜨는데 bno가 넘어오지않으면 디폴트값으로 1이 넘어온것처럼 생각하게한다
		//널을 인트로 바꿀수없어 에러가뜨는데 hitcoint가 넘어오지않으면 디폴트값으로 0이 넘어온것처럼 생각하게한다
		//bno나 hitcoint에 넘어온값이 있으면 넘어온값이 나온다.
		logger.info("write 요청처리");
		logger.info("bno:" + bno);
		logger.info("title:" + title);
		logger.info("content:" + content);
		logger.info("hitcount:" + hitcount);
		return "exam02/index";

	}
	
	@RequestMapping("/update")
	public String update(
			@RequestParam(defaultValue="1")int bno, 
			String title, String content, 
			@RequestParam(value="count", defaultValue="0")int hitcount){	//어노테이션에서 값이 두개 이상이 들어가야할때는
																			// value= 를 써넣어줘야한다. 
		
		logger.info("update 요청처리");
		logger.info("bno:" + bno);
		logger.info("title:" + title);
		logger.info("content:" + content);
		logger.info("hitcount:" + hitcount);
		return "exam02/index";

	}
	
	@RequestMapping("/send")
	public String send(Board board){	
		logger.info("send 요청처리");
		logger.info("bno:" + board.getBno());
		logger.info("title:" + board.getTitle());
		logger.info("content:" + board.getContent());
		logger.info("hitcount:" + board.getHitcount());
		return "exam02/index";

	}
}
