public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        /*for (int i = 0; i < prices.length; i++)
        {
            for (int j = i + 1; j < prices.length; j++)
            {
                int currentProfit = prices[j] - prices[i];

                if (currentProfit > bestProfit)
                {
                    bestProfit = currentProfit;
                }
            }
        }*/
        //We need to keep track of the smallest price we've currently seen
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++)
        {
            //The current price might be the new smallest one we've seen yet
            smallest = Math.min(smallest, prices[i]);
            //Now we check whether the current price and our currently-known smallest value create the best margin
            bestProfit = Math.max(bestProfit, prices[i] - smallest);
        }
        return bestProfit;
    }
}
