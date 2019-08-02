package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(101, "Jan");
		tm.put(108, "Aug");
		tm.put(105, "Apr");
		tm.put(112, "Dec");
		
		System.out.println(tm);
		
		for (@SuppressWarnings("rawtypes") Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

	}

}
