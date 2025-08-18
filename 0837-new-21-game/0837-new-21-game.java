class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + maxPts + 1];
        for (int i = k; i <= n; i++) {
            dp[i] = 1.0;
        }

        double windowSum = Math.min(n - k + 1, maxPts);
        for (int i = k - 1; i >= 0; i--) {
            dp[i] = windowSum / maxPts;
            windowSum += dp[i] - dp[i + maxPts];
        }

        return dp[0];
    }
}