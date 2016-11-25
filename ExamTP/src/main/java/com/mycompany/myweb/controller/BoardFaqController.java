package com.mycompany.myweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myweb.dto.BoardFaq;
import com.mycompany.myweb.service.BoardFaqService;

@Controller
@RequestMapping("/boardfaq")
public class BoardFaqController {
	private static final Logger logger = LoggerFactory.getLogger(BoardFaqController.class);
	
	@Autowired
	private BoardFaqService boardFaqService;
	
	@RequestMapping("/index")
	public String index() {
		
		return "boardfaq/index";
	}
	
	@RequestMapping("/list")
	public String list(String pageNum, Model model, HttpSession session, String category) {
		int intPageNo = 1;
		if(pageNum == null){
			pageNum = (String) session.getAttribute("pageNum");
			if(pageNum != null){
				intPageNo = Integer.parseInt(pageNum);
			}
		}else {
			intPageNo = Integer.parseInt(pageNum);
		}
		session.setAttribute("pageNum", String.valueOf(intPageNo));
		
		int rowsPerPage = 2;
		int pagesPerGroup = 5; 
		int totalBoardNo= 1;
		
		List<BoardFaq> list ;
		//카테고리 선택했거나 안 했거나
		if(category != null){
			totalBoardNo= boardFaqService.getCountByCategory(category);
			list = boardFaqService.listByCategory(category, intPageNo, rowsPerPage);
		}else{
			totalBoardNo = boardFaqService.getCount();
			list = boardFaqService.list(intPageNo, rowsPerPage);
		}

		
		int totalPageNo = totalBoardNo/rowsPerPage + ((totalBoardNo%rowsPerPage!=0)?1:0);
		int totalGroupNo = (totalPageNo/pagesPerGroup) + ((totalPageNo%pagesPerGroup!=0)?1:0);
		
		int groupNo = (intPageNo-1)/pagesPerGroup + 1;
		int startPageNo = (groupNo-1)*pagesPerGroup + 1;
		int endPageNo = startPageNo + pagesPerGroup - 1;
		if(groupNo == totalGroupNo) { endPageNo = totalPageNo; }
		
//		list = boardFaqService.list(intPageNo, rowsPerPage);
		
		model.addAttribute("pageNum", intPageNo);
		model.addAttribute("rowsPerPage", rowsPerPage);
		model.addAttribute("pagesPerGroup", pagesPerGroup);
		model.addAttribute("totalBoardNo", totalBoardNo);
		model.addAttribute("totalPageNo", totalPageNo);
		model.addAttribute("totalGroupNo", totalGroupNo);
		model.addAttribute("groupNo", groupNo);
		model.addAttribute("startPageNo", startPageNo);
		model.addAttribute("endPageNo", endPageNo);
		model.addAttribute("list", list);
		
		return "boardfaq/list";
	}
}
