import java.util.*;

public class ArrayBasics {
	public static boolean searchKeyPos(int[][] matrix, int key) {
		int n = matrix.length, m = matrix[0].length;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] == key) {
					System.out.println("Key found at cell: (" + i + ", " + j + ")");
					return true;
				}
			}
		}

		System.out.println("Key not found");
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		System.out.print("Enter cols: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols]; // let bn = rows, m = cols

		int n = matrix.length, m = matrix[0].length;

		// fill the matrix with values - take input for every value
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("Enter a value: ");
				matrix[i][j] = sc.nextInt();
			}
		}

		// Print the 2D array value
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

		searchKeyPos(matrix, 5);
	}
}
