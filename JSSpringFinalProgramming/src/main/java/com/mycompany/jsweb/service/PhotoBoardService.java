package com.mycompany.jsweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.jsweb.dao.PhotoBoardDao;
import com.mycompany.jsweb.dto.PhotoBoard;

@Component
public class PhotoBoardService {
	private static final int WRITE_SUCCESS = 0;
	private static final int WRITE_FAIL = 1;
	
	private static final int MODIFY_SUCCESS = 0;
	private static final int MODIFY_FAIL = 1;
	
	private static final int REMOVE_SUCCESS = 0;
	private static final int REMOVE_FAIL = 1;
	
	@Autowired
	private PhotoBoardDao photoBoardDao;
	
	public List<PhotoBoard> list(int pageNo, int rowsPerPage){
		return photoBoardDao.selectByPage(pageNo, rowsPerPage);
	}
	
	public int write(PhotoBoard photoBoard){
		int row = photoBoardDao.insert(photoBoard);
		return WRITE_SUCCESS;
	}
	
	public int modify(PhotoBoard photoBoard){
		int row = photoBoardDao.update(photoBoard);
		if(row == 0) { return MODIFY_FAIL; }
		return MODIFY_SUCCESS;
	}
	
	public int remove(int bno){
		int row = photoBoardDao.delete(bno);
		if(row == 0) { return REMOVE_FAIL; }
		return REMOVE_SUCCESS;
	}
	
	
	public PhotoBoard info(int bno){
		return photoBoardDao.selectByBno(bno);
	}
	
	public int getCount(){
		return photoBoardDao.count();
	}
}
