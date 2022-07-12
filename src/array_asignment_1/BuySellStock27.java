package array_asignment_1;

public class BuySellStock27 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];


            } else {
                if (profit < prices[i] - min) {
                    profit = prices[i] - min;
                    maxProfit += profit;
                    min = prices[i];
                    profit=0;
                }
            }

        }

        return maxProfit;
    }
}
