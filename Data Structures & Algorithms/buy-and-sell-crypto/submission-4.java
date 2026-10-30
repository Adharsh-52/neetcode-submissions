class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int x : prices) {
            minPrice = Math.min(x, minPrice);
            int potentialProfit = x - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit;
    }
}
