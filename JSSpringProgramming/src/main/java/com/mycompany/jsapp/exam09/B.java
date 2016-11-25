package com.mycompany.jsapp.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B {
	private static final Logger logger = LoggerFactory.getLogger(B.class);
	
	public B(){
		logger.info("B 객체 실행");
	}
	
	public void method(){
		logger.info("method 실행");
	}
}
