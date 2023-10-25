package com.meligys.leetcode;

public class BestTimeToBuyAndSellStock {

    public static long maxProfit(int[] prices) {

        long maxProfit = 0;
        int minToBuy = prices[0];

        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - minToBuy);
            minToBuy = Math.min(minToBuy, price);
        }

        return maxProfit;

    }
}
