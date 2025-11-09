public class SubArrays {
	public static void makeSubArrays(int[] nums) {
		int totalSubArrays = 0;

		for(int i = 0; i < nums.length; i++) {

			for(int j = i; j < nums.length; j++) {

				for(int k = i; k <= j; k++) {
					if(k == i) System.out.print("{");
					System.out.print(nums[k] + ", ");
					if(k == j) System.out.print("} ");

				}
				totalSubArrays++;
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("Total Sub Arrays: " + totalSubArrays);
	}
	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 10};

		makeSubArrays(numbers);
	}
}
