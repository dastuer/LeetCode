package easy.maxProfit;

class Solution {
    //动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit,(prices[i]-minPrice));
            minPrice = Math.min(minPrice,prices[i]);
        }
        return maxProfit;
    }
}
