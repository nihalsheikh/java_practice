import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take user inputs for nums
		System.out.print("Enter A: ");
		int A = sc.nextInt();

		System.out.print("Enter B: ");
		int B = sc.nextInt();

		System.out.print("Enter Operation [+] [-] [*] [/] [%]: ");
		char operator = sc.next().charAt(0);

		switch (operator) {
			case '+':
				System.out.println(A + " + " + B + " = " + (A + B));
				break;

			case '-':
				System.out.println(A + " - " + B + " = " + (A - B));
				break;

			case '*':
				System.out.println(A + " * " + B + " = " + (A * B));
				break;

			case '/':
				System.out.println(A + " / " + B + " = " + ((double) A / B));
				break;

			case '%':
				System.out.println(A + " % " + B + " = " + ((double) A % B));
				break;

			default:
				System.out.println("Invalid operation, Please enter one of the following: [+] [-] [*] [/] [%]");
				break;
		}

		sc.close();
	}
}
