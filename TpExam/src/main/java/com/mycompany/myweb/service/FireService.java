package com.mycompany.myweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dao.FireDao;
import com.mycompany.myweb.dto.Fire;

@Component
public class FireService {
	public static final int INPUT_SUCESS = 0;
	public static final int INPUT_FAIL = 1;
	
	public static final int REMOVE_SUCESS = 0;
	public static final int REMOVE_FAIL = 1;
	
	@Autowired
	private FireDao fireDao;
	
	public int input(Fire fire){
		int row = fireDao.insert(fire);
		if(row == 0) return INPUT_FAIL;
		return INPUT_SUCESS;
	}
	
	public int remove(int fid){
		int row = fireDao.delete(fid);
		if(row == 0) { return REMOVE_FAIL; }
		return REMOVE_SUCESS;
	}
	
	public Fire info(int frid){
		return fireDao.selectByFrid(frid);
	} 
}
