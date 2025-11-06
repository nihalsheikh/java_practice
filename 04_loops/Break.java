import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		// Break keyword
		Scanner sc = new Scanner(System.in);



		do {
			System.out.println("Inside do while loop");
			System.out.print("Enter a num: ");
			int n = sc.nextInt();

			if (n % 10 == 0) break;

			System.out.println("Remainder not 0");
		} while(true);

		System.out.println("Outside the loop");
		sc.close();
	}
}
