package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Map is not a collection

		HashMap<Integer, String> hm = new HashMap<>();// K=key V=Value
		hm.put(101, "Jan");
		hm.put(108, "Aug");
		hm.put(105, "Apr");
		hm.put(112, "Dec");
		
		System.out.println(hm);
		System.out.println(hm.entrySet());
		
		for(@SuppressWarnings("rawtypes") Map.Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" = "+m.getValue());
		}
		
		hm.remove(105);
		System.out.println(hm);
		
		hm.remove(112,"Dec");
		System.out.println(hm);

	}

}
