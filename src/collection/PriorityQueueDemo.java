package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Aman");
		pq.add("Ashok");
		pq.add("Negi");
		
		System.out.println(pq);
		
		System.out.println("Head : "+pq.element());
		System.out.println("Head : "+pq.peek());
		
		System.out.println("Removing The head element");
		pq.remove();
		System.out.println("Head : "+pq.element());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		

	}

}
