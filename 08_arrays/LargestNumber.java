public class LargestNumber {
	public static int getLargestNum(int[] nums) {
		int largest = Integer.MIN_VALUE; // -infinity
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= largest) largest = nums[i];
		}

		// System.out.println("Largest Number is: " + largest);
		return largest;

	}

	public static int getSmallestNum(int[] nums) {
		int smallest = Integer.MAX_VALUE;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] <= smallest) smallest = nums[i];
		}

		return smallest;
	}
	public static void main(String[] args) {
		int[] numbers = { 11, 2, 6, 3, 17, 5, 1, 7, 8, 14 };

		int largest = getLargestNum(numbers);
		System.out.println("Largest Number is: " + largest);

		int smallest = getSmallestNum(numbers);
		System.out.println("Smallest Number is: " + smallest);
	}
}
