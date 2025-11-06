public class Unary {
	public static void main(String[] args) {
		// Unary operators

		// Increment
		// Pre-Increment
		System.out.println("Pre-Increment");
		int a = 10;
		int b = ++a; // original a values changed here first, then used
		// Value changed first => then Used
		System.out.println(a);
		System.out.println(b);

		// Post-Increment
		System.out.println("Post-Increment");
		int c = 1;
		int d = c++; // original c value assigned (used) here first, then changed
		// Value Used first => then changed
		System.out.println(c); // 2. c++ -> c + 1 -> 2
		System.out.println(d); // 1. c's value assigned to d first

		// Decrement
		// Pre-Decrement
		System.out.println("Pre-Decrement");
		int u = 20;
		int v = --u;
		System.out.println(u);
		System.out.println(v);

		// Post-Decrement
		System.out.println("Post-Decrement");
		int x = 20;
		int y = x--;
		System.out.println(x);
		System.out.println(y);

	}
}
