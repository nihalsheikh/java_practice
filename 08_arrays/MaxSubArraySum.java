public class MaxSubArraySum {
	public static void maxSumOfSubArray(int[] nums) {
		int totalSubArrays = 0;

		int maxSum = Integer.MIN_VALUE;

		for(int i = 0; i < nums.length; i++) {

			for(int j = i; j < nums.length; j++) {
				int sumOfArrayElements = 0;

				for(int k = i; k <= j; k++) {
					System.out.print(nums[k] + " ");
				}

				for(int k = i; k <= j; k++) {
					sumOfArrayElements += nums[k];
				}
				totalSubArrays++;
				// System.out.println("max sum: " + sumOfArrayElements);
				if(sumOfArrayElements > maxSum) maxSum = sumOfArrayElements;
				System.out.println();
			}
			System.out.println("Max Sum: " + maxSum);
			System.out.println();
		}

		System.out.println("Total Sub Arrays: " + totalSubArrays);
	}

	public static void prefixSumArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int[] prefixArray = new int[nums.length];

		prefixArray[0] = nums[0];

		// calc prefixArray elements
		for(int i = 1; i < nums.length; i++) {
			prefixArray[i] = prefixArray[i-1] + nums[i];
		}

		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j < nums.length; j++) {
				int currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];

				if(currSum > maxSum) maxSum = currSum;
			}
		}

		System.out.println("Maximum Sum: " + maxSum);
	}

	public static void kadanesAlgorithm(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;

		for(int i = 0; i < nums.length; i++) {
			currSum += nums[i];

			if(currSum < 0) currSum = 0;

			maxSum = Math.max(currSum, maxSum);
		}

		System.out.println("Max Sum: " + maxSum);
	}

	public static void main(String[] args) {
		int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};

		// maxSumOfSubArray(numbers); // Brute Force Approach. Time Complexity -> O(n^3)
		// prefixSumArray(numbers); // Better than Brute Force. Time Complexity -> O(n^2)
		kadanesAlgorithm(numbers); // Optimized Approach
	}
}
