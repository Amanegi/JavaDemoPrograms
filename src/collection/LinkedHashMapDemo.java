package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		// HashMap does not preserve the insertion order whereas
		// LinkedHashMap preserves the insertion order

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(101, "Jan");
		lhm.put(108, "Aug");
		lhm.put(105, "Apr");
		lhm.put(112, "Dec");

		System.out.println(lhm);

		for (@SuppressWarnings("rawtypes") Map.Entry m : lhm.entrySet()) {
			System.out.println(m.getKey() + " = " + m.getValue());
		}

	}

}
