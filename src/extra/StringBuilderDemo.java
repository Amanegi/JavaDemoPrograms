package extra;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sbuild = new StringBuilder("Hello ");
		sbuild.append("JAVA ");
		System.out.println(sbuild);
		sbuild.append("ANDROID");
		System.out.println(sbuild);
		// System.out.println(sbuild.reverse());
		System.out.println(sbuild.delete(5, 10));
		System.out.println(sbuild.insert(5, " IOS"));
		System.out.println(sbuild.replace(5, 9, " JAVA"));

	}

}
