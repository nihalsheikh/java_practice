import java.util.Scanner;

public class Butterfly {
	public static void butterflyPattern(int n) {
		// TOP PART
		for(int i = 1; i <= n; i++) {
			// triangle
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Spaces
			for(int j = 1; j <= 2 * (n-i); j++) {
				System.out.print(" ");
			}

			// triangle
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// BOTTOM PART
		for(int i = n; i >= 1; i--) {
			// triangle
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Spaces
			for(int j = 1; j <= 2 * (n-i); j++) {
				System.out.print(" ");
			}

			// triangle
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		butterflyPattern(n);

		sc.close();
	}
}
