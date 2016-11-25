package ch11.exam09;

public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11.exam09." + args[0]);		//풀네임을 써야하야지만 편하기위해서 ""안에 패키지이름을 넣어놓는다.
		Object obj = clazz.newInstance();		
		Action action = (Action) obj;
		action.execute();
	}

}
