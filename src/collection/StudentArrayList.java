package collection;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {

		Student s1 = new Student("Aman", 18, "Btech");
		Student s2 = new Student("Amar", 22, "Mtech");
		Student s3 = new Student("Akash", 18, "MA");
		Student s4 = new Student("Manoj", 18, "LLB");
		Student s5 = new Student("Ram", 18, "BBA");

		ArrayList<Student> stdal = new ArrayList<>(); // ArrayList of Student
														// class (user-defined
														// data-type)
		stdal.add(s1);
		stdal.add(s2);
		stdal.add(s3);
		stdal.add(s4);
		stdal.add(s5);

		// System.out.println(stdal);

		for (Student s : stdal) {
			// System.out.println(s); Alternative way
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getName());
		}

	}

}
