package com.java.algothrim.array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
public class StockProfit {

//    public int maxProfit(int prices[]) {
//        int minprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minprice)
//                minprice = prices[i];
//            else if (prices[i] - minprice > maxprofit)
//                maxprofit = prices[i] - minprice;
//        }
//        return maxprofit;
//    }

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    public static int maxProfitII(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > minPrice){
                profit += prices[i] - minPrice;
            }
            minPrice = prices[i];
        }
        return profit;
    }

    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxprofit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else {
                if(prices[i] - minPrice > maxprofit){
                    maxprofit = prices[i] - minPrice;
                }
            }
        }
        return maxprofit;
    }
}
