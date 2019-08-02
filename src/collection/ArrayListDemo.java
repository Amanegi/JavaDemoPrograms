package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ram");
		al.add("Rama");
		al.add("Ramu");
		al.add("Raju");
		al.add("Dhamu");
		al.add("Kaju");

		System.out.println(al);
		// ctrl + shift + /
		for (String s : al) {
			System.out.println(s);
		}

		Iterator<String> itr = al.iterator(); // iterator = traversing
		while (itr.hasNext()) { // hasNext check if arraylist has value
			System.out.println(itr.next());
		}

		al.remove(2); // remove = to delete element
		System.out.println("ArrayList After deleting 3 element " + al);

		al.remove("Ram");
		System.out.println(al);

	}

}
