package com.leet;

public class Problem121 {
	public int maxProfit(int[] prices) {
		if(prices==null||prices.length==0)
			return 0;
		
		int maxProfit = 0;
		int minStock = prices[0];
		for (int i = 0; i < prices.length; i++) {
			int curr = prices[i];
			if (curr < minStock) {
				minStock = curr;
			}
			if (curr - minStock > maxProfit) {
				maxProfit = curr - minStock;
			}

		}
       return maxProfit;
	}

}
