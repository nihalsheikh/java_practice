import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		// Reverse The Original Number
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to reverse: ");
		int n = sc.nextInt();

		int revNum = 0;
		int lastDigit = 0;

		while (n > 0) {
			lastDigit = n % 10;
			n /= 10;
			revNum = (revNum * 10) + lastDigit;
		}

		System.out.println(revNum);


		sc.close();
	}
}
