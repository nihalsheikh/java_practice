import java.util.Scanner;

public class Diamond {
	public static void diamondPattern(int n) {
		// Top Pyramid
		for(int i = 1; i <= n; i++) {
			// spaces
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}

			// Pyramid
			for(int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// Inverted Pyramid
		for(int i = n; i >= 1; i--) {
			// spaces
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}

			// Pyramid
			for(int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		diamondPattern(n);

		sc.close();
	}
}
