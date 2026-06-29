// Problem: Best Time to Buy and Sell Stock
// LeetCode: 121
// Approach: Track the minimum buying price and calculate the maximum profit
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < buy) {
                buy = prices[i];
            }
            else {
                int sell = prices[i] - buy;

                if(sell > profit) {
                    profit = sell;
                }
            }
        }

        return profit;
    }
}
