class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long) num);
        }

        int count = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size()<2) {
                return -1;
            }  

            long a = pq.remove();
            long b = pq.remove();
            long insert = a*2+ b;

            pq.add(insert);
            count++;
        }

        return count;
    }
}