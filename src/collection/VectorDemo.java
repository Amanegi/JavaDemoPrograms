package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Jan");
		v.add("Feb");
		v.add("Mar");
		v.add("Apr");
		
		System.out.println(v);
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		v.remove(0);
		System.out.println(v);
		
		v.remove("Feb");
		System.out.println(v);
	}

}
