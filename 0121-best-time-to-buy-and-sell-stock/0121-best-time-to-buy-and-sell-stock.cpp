class Solution {
public:
    int maxProfit(vector<int>& prices) {
    
        int n  = prices.size();
        int profit  = 0;
        int minValue = prices[0];
        for(int i = 1; i <n ; i++)
        {
            if(prices[i] < minValue)
            {
                minValue = prices[i];
            }
            else
            {
                 profit =  max(profit, prices[i] - minValue);
            }
        }

        return profit;

    }
};