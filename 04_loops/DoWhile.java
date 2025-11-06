public class DoWhile {
	public static void main(String[] args) {
		int counter = 0;

		System.out.println("Started: do while loop");
		do {
			System.out.println(counter);
			counter++;
		}
		while (counter < 10);
		System.out.println("Ended: do while loop");
	}
}
