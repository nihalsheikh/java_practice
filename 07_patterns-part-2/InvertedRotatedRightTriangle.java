import java.util.Scanner;

public class InvertedRotatedRightTriangle {
	public static void invertedRotatedRightTriangle(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}

			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();

		invertedRotatedRightTriangle(n);

		sc.close();
	}

}
