package ch13.exam06;

public class Util {
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;		//&& 둘다 트루일때만 트루
	}
	/*
	public static <K,V> boolean max(Pair<K,V>p3, Pair<K,V>p4){
		return p4;
	}*/
}
