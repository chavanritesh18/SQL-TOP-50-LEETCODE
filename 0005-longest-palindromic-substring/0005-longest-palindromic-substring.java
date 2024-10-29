class Solution {

    //private int [][] t;

    private boolean solve(String s , int l , int r)
    {
        while(l <= r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        
        int n  = s.length();
        int maxLen  = Integer.MIN_VALUE;

        int startingIndex  = 0;

        for(int i  = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                if(solve(s , i , j))
                {
                    if(j - i + 1 > maxLen)
                    {
                          startingIndex  = i;
                          maxLen  =  j  -  i + 1;
                    }
                    
                }
            }
        }


        return s.substring(startingIndex , startingIndex + maxLen);

    }
  
}
