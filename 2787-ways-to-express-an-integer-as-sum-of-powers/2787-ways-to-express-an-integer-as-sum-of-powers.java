class Solution {
    public int numberOfWays(int n, int x) {
        int mod = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        
        int num = 1;
        while (Math.pow(num, x) <= n) {
            int target = (int) Math.pow(num, x);
            
            for (int i = n; i >= target; i--) {
                dp[i] = (dp[i] + dp[i - target]) % mod; 
            }
            
            num++;
        }
        
        return dp[n]; 
    }
}