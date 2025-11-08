import java.util.Scanner;

public class FunctionOverloading {
	// Sum of Two Integers
	public static int sum(int a, int b) {
		return a + b;
	}

	// Sum of Three Integers
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	// Sum of Two Floats  
	public static float sum(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();

		System.out.print("Enter b: ");
		int b = sc.nextInt();

		System.out.print("Enter c: ");
		int c = sc.nextInt();

		System.out.print("Enter x: ");
		float x = sc.nextFloat();

		System.out.print("Enter y: ");
		float y = sc.nextFloat();

		int sumOfTwoInt = sum(a, b);
		System.out.println("Sum of Int: " + a + " + " + b + " = " + sumOfTwoInt);

		int sumOfThreeInt = sum(a, b, c);
		System.out.println("Sum of Int: " + a + " + " + b + " + " + c + " = " + sumOfThreeInt);

		float sumOfTwoFloat = sum(x, y);
		System.out.println("Sum of Float: " + a + " + " + b + " = " + sumOfTwoFloat);

		sc.close();
	}
}
