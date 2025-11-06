public class Ternary {
	public static void main(String[] args) {
		// Ternary operator
		int bigNum = 10 > 5 ? 10 : 5;

		System.out.println(bigNum);

		String oddEvenNum = (bigNum % 2 == 0) ? "even" : "odd";
		System.out.println(oddEvenNum);
	}
}
