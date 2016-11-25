package ch18.exam09;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		
		File file = new File("C:/Temp/aaa");	//aaa가 파일인지 디렉터리인지 모름
		if(file.exists()){
			if(file.isDirectory()){		//디렉터리인지 검사
				System.out.println("디렉터리가 존재함");
			} else {
				System.out.println("파일이 존재함");
			}	
		} else {
			System.out.println("존재하지 않음");
		}
		
		File dir = new File("C:/Temp/dir1/dir2/dir3");
		//dir.mkdir();		//dir3을 만들지만 dir1과 2가 없기 때문에 에러가뜸 dir1과 2가있으면 3이 생성됨
		dir.mkdirs();		//dir1과 2가 없다고 하더라도 1부터 3까지 다 만듬
		dir.delete();		//dir3만 지워짐
		
	}

}
