package ch15.homework.exam8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"감자바"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()){
			Student student = iterator.next();
			System.out.println(student.bno +":"+student.bname);
		}
	}

}
