class Solution {
    public int tupleSameProduct(int[] nums) {
         int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int val = nums[i] * nums[j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        
        int res = 0;
        for (int val : map.values()) {
            if (val > 1) {
                res += 8 * (val * (val - 1)) / 2;  // Combination formula C(val,2) * 8
            }
        }
        
        return res;
    }
}