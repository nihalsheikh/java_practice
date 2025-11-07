import java.util.Scanner;

public class FunctionParameters {
	public static int calculateSum(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a= sc.nextInt();

		System.out.print("Enter b: ");
		int b = sc.nextInt();

		int sum = calculateSum(a, b);
		System.out.println("Sum is: " + sum);

		sc.close();
	}
}
