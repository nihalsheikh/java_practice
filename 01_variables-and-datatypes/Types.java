public class Types {
	public static void main(String[] args) {
		// Type Conversion
		System.out.println("This is Type Conversion");
		int a = 25;
		long b = a;
		System.out.println("Converted int to long: " + b);

		// Type Casting
		System.out.println("This is Type Casting");
		float f = 3.14f;
		int x = (int)f;
		System.out.println("Casted float to int: " + x);

		// Type Promotion
		System.out.println("This is Type Promotion");
		int p = 10;
		float q = 34.45f;
		long r = 30;
		double s = 25;
		double total = p + q + r + s;
		System.out.println("Type Promotion of int + flaot + long + double is: " + total);
	}
}
