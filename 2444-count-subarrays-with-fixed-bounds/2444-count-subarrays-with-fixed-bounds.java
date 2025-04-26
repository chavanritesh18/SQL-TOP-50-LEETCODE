class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int n = nums.length;
        int lastInvalid = -1;
        int lastMin = -1;
        int lastMax = -1;

        for (int j = 0; j < n; j++) {
            if (nums[j] < minK || nums[j] > maxK) {
                lastInvalid = j;
            }
            if (nums[j] == minK) {
                lastMin = j;
            }
            if (nums[j] == maxK) {
                lastMax = j;
            }

            
            int validStart = Math.min(lastMin, lastMax);
            if (validStart > lastInvalid) {
                ans += validStart - lastInvalid;
            }
        }

        return ans;
    }
}