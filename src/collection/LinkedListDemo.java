package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();// Generic type
		ll.add("Aman");
		ll.add("Kartik");
		ll.add("Pravesh");
		ll.add("Pranav");
		ll.add("Goli");
		ll.add("Ashu");

		System.out.println(ll);

		for (String s : ll) {
			System.out.println(s);
		}

		Iterator<String> itr = ll.iterator();// Output using iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator<String> listitr = ll.listIterator();
		// Can visit element in forward and reverse direction
		// ListIterator is only available for list interface
		System.out.println("Visiting element in forward direction");
		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}

		System.out.println("Visiting element in backward direction");
		while (listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}

	}

}
