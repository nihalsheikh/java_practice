public class Logical {
	public static void main(String[] args) {
		//  Logical Operators

		System.out.println("Logical AND - (&&)");
		System.out.println("(3 > 2) && (5 > 0) : " + ((3 > 2) && (5 > 0)));
		System.out.println("(3 > 2) && (5 < 0) : " + ((3 > 2) && (5 < 0)));
		System.out.println("(3 < 2) && (5 > 0) : " + ((3 < 2) && (5 > 0)));
		System.out.println("(3 < 2) && (5 < 0) : " + ((3 < 2) && (5 < 0)) + "\n");

		System.out.println("Logical OR - (||)");
		System.out.println("(3 > 2) || (5 > 0) : " + ((3 > 2) || (5 > 0)));
		System.out.println("(3 > 2) || (5 < 0) : " + ((3 > 2) || (5 < 0)));
		System.out.println("(3 < 2) || (5 > 0) : " + ((3 < 2) || (5 > 0)));
		System.out.println("(3 < 2) || (5 < 0) : " + ((3 < 2) || (5 < 0)) + "\n");

		System.out.println("Logical NOT - (!)");
		System.out.println("!(5 > 0) : " + !(5 > 0));
		System.out.println("!(5 < 0) : " + !(5 < 0));
	}
}
