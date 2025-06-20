class Solution {
    public int maxAscendingSum(int[] nums) {

       int maxi  = nums[0];

       int n  = nums.length;

       if(n==1) return nums[0];

       int sum  = nums[0];

       for(int i = 1; i < n; i++){
        if(nums[i-1] < nums[i]){
            sum += nums[i];
        }
        else{
            sum = nums[i];
        }
         maxi =  Math.max(maxi,sum);
       }
 
      return maxi;

    }
}