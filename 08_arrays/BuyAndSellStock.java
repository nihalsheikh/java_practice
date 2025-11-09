public class BuyAndSellStock {
	public static int sellAndBuyStocks(int[] prices) {
		// buy price should be Lowest buying price
		int buyPrice = Integer.MAX_VALUE;

		// track the maximum profilt
		int maxProfit = 0;

		for(int i = 0; i < prices.length; i++) {
			if(buyPrice < prices[i]) {
				int profit = prices[i] - buyPrice; // i index profit
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buyPrice = prices[i];
			}
		}

		return maxProfit;
	}
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};

		int profit = sellAndBuyStocks(prices);
		System.out.println("Maximum Profit: " + profit);
	}
}
