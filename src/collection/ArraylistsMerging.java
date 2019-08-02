package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistsMerging {
 
	public static void main(String[] args) {

		ArrayList<String> arl1 = new ArrayList<>();
		arl1.add("T");
		arl1.add("H");
		arl1.add("E");
		arl1.add("Q");
		arl1.add("U");
		arl1.add("I");
		arl1.add("C");
		arl1.add("K");
		arl1.add("B");
		arl1.add("R");
		arl1.add("O");
		arl1.add("W");
		arl1.add("N");			
		arl1.add("F");
		arl1.add("O");
		arl1.add("X");

		System.out.println(arl1);

		ArrayList<String> arl2 = new ArrayList<>();
		arl1.add("J");
		arl1.add("U");
		arl1.add("M");
		arl1.add("P");
		arl1.add("O");
		arl1.add("V");
		arl1.add("E");
		arl1.add("R");
		arl1.add("L");
		arl1.add("A");
		arl1.add("Z");
		arl1.add("Y");
		arl1.add("D");
		arl1.add("O");
		arl1.add("G");
		System.out.println(arl2);
		arl2.removeAll(arl1);

		arl2.addAll(arl1);
		System.out.println(arl2);

		Collections.sort(arl2);// Sorting
		System.out.println(arl2);
		
		System.out.println();
		
		Iterator<String> it = arl2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
