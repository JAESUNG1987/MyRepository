package com.mycompany.myweb.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myweb.dto.Member;
import com.mycompany.myweb.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/login")
	public String login(String mid, String mpassword, HttpSession session, Model model, HttpServletResponse response) {
		String result = "success";
		int intResult = memberService.login(mid, mpassword);		
		if(intResult == MemberService.LOGIN_SUCCESS) {
			session.setAttribute("login", mid);
		} else if(intResult == MemberService.LOGIN_FAIL_MID) {
			result = "wrongMid";
		} else {
			result = "wrongMpassword";
		}
		model.addAttribute("result", result);
		return "member/login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("login");
		return "member/logout";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinForm(){
		return "member/joinForm";
	}
	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String join(Member member){
		try{
			int result = memberService.join(member);
			return "redirect:/member/login";
		}catch(Exception e){
			return "member/loginForm";
		}
	}
	
	/* 패스워드 검증 기능은 아직 넣지 않음 -> 새 페이지 혹은 모달창이나 자바스크립트로 구현 예정 */
	@RequestMapping("/info")
	public String info(String mpassword, HttpSession session, Model model){
		/*if(mpassword == null){
			return "redirect:/";
		}*/
		String mid = (String) session.getAttribute("login");
		Member member = memberService.info(mid, mpassword);
		model.addAttribute("member", member);
		return "member/info";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modifyForm(String mid, Model model){
		Member member = memberService.info(mid, null);
		model.addAttribute("member", member);
		return "member/modifyForm";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(Member member){
		//Member dbMember = memberService.info(member.getMid(), null);
		logger.info(member.toString());
		memberService.modify(member);
		
		return "redirect:/member/info";
	}
	
	@RequestMapping("/remove")
	public String remove(String mid, String mpassword, HttpSession session){
		memberService.withdraw(mid, mpassword);
		session.removeAttribute("login");
		return "redirect:/";
	}
	
	@RequestMapping(value="/findMid", method=RequestMethod.GET)
	public String findMidForm(){
		return "member/findMidForm";
	}
	
	@RequestMapping(value = "/findMid", method = RequestMethod.POST)
	public String findMid(String memail, Model model, HttpSession session){
		String mid = memberService.findMid(memail);
		if (mid == null) {
			model.addAttribute("error", "이메일이 존재하지 않음");
			return "member/findMidForm";
		}
		session.setAttribute("findMid", mid);
		return "member/findMidOk";
	}
	
	@RequestMapping(value="/findMpassword", method=RequestMethod.GET)
	public String findMpasswordForm(){
		return "member/findMpasswordForm";
	}
	
	@RequestMapping(value="/findMpassword", method=RequestMethod.POST)
	public String findMpassword(String mid, String memail, Model model, HttpSession session){
		String mpassword = memberService.findMpassword(mid, memail);
		if (mpassword == null){
			model.addAttribute("error", "아이디또는 이메일이 일치하지 않음");
			return "member/findMpasswordForm";
		}
		session.setAttribute("findMpassword", mpassword);
		return "member/findMpasswordOk";
	}
}
