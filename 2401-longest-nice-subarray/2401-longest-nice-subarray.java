class Solution {
    public int longestNiceSubarray(int[] nums) {
         int n = nums.length;
        int ans = 1;

        int i = 0, j = 0;
        int mask = 0;
        while (j < n) {

            while (i < j && (mask & nums[j]) != 0) { //keep shrinking from left using XOR
                mask = (mask ^ nums[i]);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            mask = mask | nums[j];
            j++;
        }
        return ans;
    }
}