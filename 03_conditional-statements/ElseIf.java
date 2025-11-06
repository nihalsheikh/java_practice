public class ElseIf {
	public static void main(String[] args) {
		// Else if condition
		int age = 15;

		if (age > 18) {
			System.out.println("Person is an Adult of age: " + age);
		} else if (age >= 13 && age < 18) {
			System.out.println("Person is a Teenager of age: " + age);
		} else {
			System.out.println("Person is a child");
		}
	}
}
