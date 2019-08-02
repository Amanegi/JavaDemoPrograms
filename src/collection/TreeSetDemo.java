package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		// TreeSet maintains ascending order
		
		ts.add("Aman");
		ts.add("Negi");
		ts.add("Amit");
		ts.add("Sonu");

		System.out.println(ts);
		
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
