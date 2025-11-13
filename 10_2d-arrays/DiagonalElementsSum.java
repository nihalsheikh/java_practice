public class DiagonalElementsSum {
	public static int diagonalSum(int[][] matrix) {
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;

		//  Brute Force Approach. Time Complexity = O(n^2)
		// for(int i = 0; i < matrix.length; i++) {
		// 	for(int j = 0; j < matrix[0].length; j++) {
		// 		if(i == j) {
		// 			primaryDiagonalSum += matrix[i][j];
		// 		} else if(i + j == matrix.length - 1) {
		// 			secondaryDiagonalSum += matrix[i][j];
		// 		}
		// 	}
		// }

		// Optimized Approach. Time Complexity = O(n)
		for(int i = 0; i < matrix.length; i++) {
			// Primary Diagonal condition: i == j
			primaryDiagonalSum += matrix[i][i];

			// Secondary Diagonal Condition: i + j = n - 1; => j = n - 1 - i
			if(i != matrix.length - 1 - i) { // adding this condition to not add overlapping diagonal element
				secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
			}
		}

		return primaryDiagonalSum + secondaryDiagonalSum;
	}
	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16},
		};

		int sum = diagonalSum(matrix);
		System.out.println("Sum of Diagonals = " + sum);
	}
}
