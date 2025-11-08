import java.util.*;

public class RangePrime {
	public static boolean isPrime(int n) {
		// for n = 1 or n <= 0
		if(n == 1 || n <= 0) return false;

		// for n = 2
		if(n == 2) return true;

		// for n > 2
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}

		return true;
	}

	public static void rangePrime(int n) {
		for(int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		rangePrime(n);

		sc.close();
	}

}
