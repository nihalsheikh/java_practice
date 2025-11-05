import java.util.*;

public class CalculateSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		int a = sc.nextInt();

		System.out.print("b = ");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("Sum is: " + sum);

		sc.close();
	}
}
