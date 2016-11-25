package ch08.service;

import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam05 {
	public static void main(String[] args){
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBno(7);
		board.setBtitle("제목바뀜");
		board.setBcontent("내용바뀜");
		board.setBdate(new Date(1990,11,17));
		
		dao.update(board);
	}
}
