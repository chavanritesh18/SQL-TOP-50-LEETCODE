class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long result = 0;
        Map<Integer, Integer> diffCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            int sameDiffCount = diffCount.getOrDefault(diff, 0);
            result += (i - sameDiffCount); 
            diffCount.put(diff, sameDiffCount + 1);
        }
        return result;
    }
}