import java.util.Scanner;

public class Rhombus {
	public static void solidRhombus(int n) {
		for(int i = 0; i < n; i++) {
			// spaces
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}

			// rhombus
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		solidRhombus(n);

		sc.close();
	}
}
