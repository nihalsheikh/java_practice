import java.util.Arrays;

public class InsertionSortAlgo {
	public static void selectionSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int currPos = nums[i];
			int prevPos = i-1;

			// finding the insertion index postion
			while(prevPos >= 0 && nums[prevPos] > currPos) {
				nums[prevPos + 1] = nums[prevPos];
				prevPos--;
			}

			// insert the element
			nums[prevPos + 1] = currPos;
		}
	}

	public static void printArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] numbers = {5, 4, 1, 3, 2};

		// selectionSort(numbers);

		Arrays.sort(numbers, 0, 3); // using inbuilt java package
		printArray(numbers);
	}
}
