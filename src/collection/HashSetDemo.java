package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("Aman");
		hs.add("Aman");
		hs.add("Singh");
		hs.add("Singh");
		hs.add("Negi");
		hs.add("Jai");

		System.out.println(hs);// Similar elements are not shown and elements
								// are not shown in series

		// Insertion order is not maintain in HashSet
		// HashSet only contain unique element
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		hs.remove("Negi");
		System.out.println();
	}

}
