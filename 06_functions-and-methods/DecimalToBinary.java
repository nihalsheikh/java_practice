import java.util.*;

public class DecimalToBinary {
	public static int decToBin(int decNum) {
		int binNum = 0;
		int power = 0;

		while(decNum > 0) {
			int remainder = decNum % 2;
			binNum = binNum + (remainder * (int) Math.pow(10, power));
			decNum /= 2;
			power++;
		}

		return binNum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int binary = decToBin(n);
		System.out.println("Binary of " + n + " = " + binary);

		sc.close();
	}
}
