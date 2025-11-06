import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		System.out.println("Square Loop");

		Scanner sc = new Scanner(System.in);

		// Square Loop
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("# # # #");
		}

		sc.close();
	}
}
