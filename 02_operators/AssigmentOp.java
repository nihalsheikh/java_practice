public class AssigmentOp {
	public static void main(String[] args) {
		int A = 10;
		int B = A;

		// =
		System.out.println("A = 10, -> B = A : " + B);

		// +=
		System.out.println("A += 10 : " + (A += 10)); // new value of A = 20

		// -=
		System.out.println("A -= 10 : " + (A -= 10)); // new value of A = 10

		// *=
		System.out.println("A *= 10 : " + (A *= 10)); // new value of A = 100

		// /=
		System.out.println("A /= 10 : " + (A /= 10)); // new value of A = 10

		// %=
		System.out.println("A %= 10 : " + (A %= 10)); // new value of A = 0
	}
}
