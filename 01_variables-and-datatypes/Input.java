import java.util.Scanner;
// import java.util.*; // Includes all Java in-built classes

public class Input {
	public static void main(String[] args) {
		// Take an input from User'
		Scanner sc = new Scanner(System.in);

		// Byte input
		System.out.println("Enter a byte: ");
		byte byteNum = sc.nextByte();
		System.out.println("Byte Num is: " + byteNum);

		// Short input
		System.out.println("Enter a short: ");
		short shortNum = sc.nextShort();
		System.out.println("Short Num is: " + shortNum);

		// Int input
		System.out.println("Enter an int: ");
		int intNum = sc.nextInt();
		System.out.println("Int Num is: " + intNum);

		// Long input
		System.out.println("Enter a long: ");
		long longNum = sc.nextLong();
		System.out.println("Long Num is: " + longNum);

		// Float input
		System.out.println("Enter a float: ");
		float floatNum = sc.nextFloat();
		System.out.println("Float Num is: " + floatNum);

		// Double input
		System.out.println("Enter a double: ");
		double doubleNum = sc.nextDouble();
		System.out.println("Double Num is: " + doubleNum);

		// String/Char - Single Word input
		System.out.println("Enter a word: ");
		String word = sc.next();
		System.out.println("Word is " + word);

		// String/Char - Whole sentence input
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Sentence is: " + sentence);

		// Boolean input
		System.out.println("Enter a boolean: ");
		boolean boolValue = sc.nextBoolean();
		System.out.println("Boolean value is: " + boolValue);

		// Close Scanner class
		sc.close();
	}
}
