class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            int next=(i + 1) % l;
            int dif=Math.abs(nums[i] - nums[next]);
            if(dif>max){
                max=dif;
            }
        }
        return max;
    }
}