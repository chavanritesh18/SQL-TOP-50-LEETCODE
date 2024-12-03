class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        int n = s.length();
        int m  = spaces.length;
  
        StringBuilder st  = new StringBuilder();

      
        int j  = 0;

        for(int i   = 0; i < n; i++)
        {
             if(  j < m && i == spaces[j] )
             {
                st.append(" ");
                j++;
             }
             st.append(s.charAt(i));
        }

        return st.toString();

    }
}