package mypackage;

public class ConstructorDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		r.display();
		System.out.println("\n");
		Rectangle r1 = new Rectangle();
		r1.display();
		System.out.println(r1.area());
		System.out.println("\n");
		Rectangle r2 = new Rectangle(r);
		r2.display();
		System.out.println(r2.area());

	}

}
