public class BinarySearch {
	public static int binarySearch(int[] nums, int key) {
		int start = 0, end = nums.length - 1;

		while(start <= end) {
			int mid = (start + end) / 2;

			// when key is the middle value itself
			if(key == nums[mid]) return mid;

			if(key > nums[mid]) {
				// update start index position
				start = mid + 1;
			} else {
				// update end index position
				end = mid - 1;
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18};
		int key = 12;

		int index = binarySearch(numbers, key);
		System.out.println("Index of key is: " + index);
	}
}
