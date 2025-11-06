import java.util.Scanner;

public class DigitReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit to reverse: ");
		int n = sc.nextInt();

		while(n > 0) {
			int lastDigit = n % 10;
			n /= 10;
			System.out.print(lastDigit);
		}
		System.out.println();

		sc.close();
	}
}
