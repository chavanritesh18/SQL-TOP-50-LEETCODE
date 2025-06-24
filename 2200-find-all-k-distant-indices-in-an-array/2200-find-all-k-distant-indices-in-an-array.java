class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
         ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(nums[i] == key){
                arr.add(i);
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < arr.size();j++){
                if(Math.abs(i - arr.get(j)) <= k){
                    answer.add(i);
                    break;
                }
            }
        }
        return answer;
    }
}