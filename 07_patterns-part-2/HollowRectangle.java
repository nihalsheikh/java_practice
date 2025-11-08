import java.util.Scanner;

public class HollowRectangle {
	public static void hollowRectangle(int rows, int cols) {
		for(int i=0; i < rows; i++ ) {
			for(int j = 0; j < cols; j++) {
				if(i == 0 || i == rows-1 || j == 0 || j == cols-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int rows = sc.nextInt();

		System.out.print("Number of cols: ");
		int cols = sc.nextInt();

		hollowRectangle(rows, cols);

		sc.close();
	}
}
