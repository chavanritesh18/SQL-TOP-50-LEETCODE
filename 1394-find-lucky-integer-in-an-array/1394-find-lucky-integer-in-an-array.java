class Solution {
    public int findLucky(int[] arr) {
         Map<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int maxi = -1;
        for (int num : hm.keySet()) {
            if (num == hm.get(num)) {
                maxi = Math.max(maxi, num);
            }
        }
        return maxi;
    }
}