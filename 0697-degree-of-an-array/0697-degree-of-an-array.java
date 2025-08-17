class Solution {
    public int findShortestSubArray(int[] nums) {
          Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            first.putIfAbsent(x, i);
            last.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int degree = Collections.max(count.values());
        int ans = nums.length;

        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, last.get(x) - first.get(x) + 1);
            }
        }
        return ans;
    }
}