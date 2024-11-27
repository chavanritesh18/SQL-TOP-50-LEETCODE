class Solution {
    public int jump(int[] nums) {
        
        int maxJump = 0 , currentInd  = 0 , furthest  = 0;

        for(int i = 0; i < nums.length  - 1; i++)
        {
            furthest  =  Math.max(furthest , nums[i] + i);

            if(i == currentInd)
            {
                maxJump++;
                currentInd = furthest ;
            }
        }

        return maxJump;

    }
}