import java.util.*;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take a num to check if its prime
		System.out.print("Enter a num: ");
		int n = sc.nextInt();

		boolean isPrime = true;

		if(n == 2) {
			System.out.println(n + " is Prime");
		} else {
			// for (int i = 2; i < n-1; i++) {
			// 	if(n % i == 0) isPrime = false;
			// }

			for (int i = 2; i <= Math.sqrt(n); i++) {
				System.out.print(i + ", ");
				if(n % i == 0) isPrime = false;
			}

			if(isPrime == true) {
				System.out.println(n + " is Prime");
			} else {
				System.out.println(n + " is not a Prime");
			}
		}


		sc.close();
	}
}
