package overrriding;

public class Person {

	String name;
	int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Display
	void display() {
		System.out.println("Name\t\t= " + name);
		System.out.println("Age\t\t= " + age);
	}
}
