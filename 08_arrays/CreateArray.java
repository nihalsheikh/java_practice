public class CreateArray {
	public static void main(String[] args) {
		// Array Declaration
		int[] pages = new int[10];

		// initializing array
		pages[0] = 1;

		// Array Declaration and Initialization
		int[] marks = {90, 92, 97};

		System.out.println("Physics marks: " + marks[0]);
		System.out.println("Chemistry marks: " + marks[1]);
		System.out.println("Maths marks: " + marks[2]);

		marks[0] = 100;
		System.out.println("New Physics marks: " + marks[0]);
	}
}
