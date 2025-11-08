import java.util.*;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		// for 0<= n <= 1
		if(n == 1 || n <= 0) return false;

		// for n = 2
		if(n == 2) return true;

		// //  for n >= 2 with n steps
		// for(int i = 2; i < n-1; i++) {
		// 	if(n%i == 0) {
		// 		return false;
		// 	}
		// }

		//  for n >= 2 with root(n) steps
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) return false;
		}

		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		boolean num = isPrime(n);
		System.out.println("Is " + n + " prime? " + num);

		sc.close();
	}
}
