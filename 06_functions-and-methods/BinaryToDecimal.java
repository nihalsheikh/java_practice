import java.util.*;

public class BinaryToDecimal {
	public static int binToDec(int binNum) {
		int decimalNum = 0;
		int power = 0;

		while (binNum > 0) {
			int lastDigit = binNum % 10;
			decimalNum = decimalNum + (lastDigit * (int)Math.pow(2, power));
			binNum /= 10;
			power++;

			if(binNum == 0) break;
		};

		return decimalNum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: " );
		int n = sc.nextInt();

		int decimal = binToDec(n);
		System.out.println("Decimal of " + n + " is: " + decimal);

		sc.close();
	}
}
