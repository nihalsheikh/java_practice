public class TrappedRainwater {
	public static int calcTrappedRainwater(int[] height) {
		int totalTrappedWater = 0;
		int width = 1;

		int n = height.length;

		// calculate Left Max Boundary - make array
		int[] leftMaxBoundary = new int[n];

		// first leftMaxBoundary is same as the original array element[0]
		leftMaxBoundary[0] = height[0];

		for(int i=1; i < n; i++) {
			leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
		}

		// calculate Right Max Boundary - make array
		int[] rightMaxBoundary = new int[n];

		// first leftMaxBoundary is same as the original array element[0]
		rightMaxBoundary[n-1] = height[n-1];

		for(int i = n-2; i >= 0; i--) {
			rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
		}

		for(int i = 0; i < n; i++) {
			// Calculate WaterLevel = Minimum(leftMaxBoundary, rightMaxBoundary)
			int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

			// Trappwed Water = (WaterLevel - Height[i]) * width of bar
			totalTrappedWater += (waterLevel - height[i]) * width;
		}

		return totalTrappedWater;
	}
	public static void main(String[] args) {
		int[] barHeight = {4, 2, 0, 6, 3, 2, 5};

		int waterLevel = calcTrappedRainwater(barHeight);
		System.out.println("Total Trapped Water is: " + waterLevel);
	}
}
