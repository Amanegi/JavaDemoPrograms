package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		// LinkedHashSet maintains insertion order
		// Duplicate elements cannot be stored

		lhs.add("Aman");
		lhs.add("Negi");
		lhs.add("Ashu");
		lhs.add("Amit");

		System.out.println(lhs);

		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
