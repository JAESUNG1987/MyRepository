package ch13.exam10;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Key, Value> map1 = new HashMap<Key, Value>();
		HashMap<ChildKey, ChildValue> map2 = new HashMap<ChildKey, ChildValue>();
		
		map1.putAll(map2);
		//map2.putAll(map1);		//차일드 키와벨류는 키와벨류의 자식객체라서 안됨
	}

}

class Key{}
class ChildKey extends Key{}
class Value{}
class ChildValue extends Value{}