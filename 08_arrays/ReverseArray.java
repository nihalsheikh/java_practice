public class ReverseArray {
	public static void reverseTheArray(int[] nums) {
		// Method 1: Create a new Array and store the values in reverse order
		// int[] revNum = new int[nums.length];

		// for(int i = 0; i < nums.length; i++) {
		// 	revNum[i] = nums[nums.length-(i+1)];
		// }

		// Method 2: Swap the values in the original array itself
		int start = 0, end = nums.length-1;

		while(start < end) {
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;

			start++; // increase the start index position
			end--; // decrease the last index position
		}

		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 7};

		reverseTheArray(numbers);
	}
}
