package mypackage;

public class ObjectClassesDemo {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		// Do not run when length and breadth is private
		// r.length=10; r.breadth=30;
		r.setData(10, 30);
		r.display();
		int ar = r.area();
		System.out.println("Area = " + ar);

	}

}
