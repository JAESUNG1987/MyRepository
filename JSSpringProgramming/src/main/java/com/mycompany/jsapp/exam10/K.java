package com.mycompany.jsapp.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class K {
	private static final Logger logger = LoggerFactory.getLogger(K.class);
	
	@Autowired		//Spring DI 컨테이너 자동으로 대입
	private G g;
	@Autowired
	private H h;
	
	public K(G g, H h){
		logger.info("K 객체 생성");
	}
	
	public void method(){
		logger.info("method 실행");
		g.method();
		h.method();
	}
	
}
