class Solution {
    public boolean isPalindrome(String s) {

        String str = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                str += s.charAt(i);
            }
        }

        str =  str.toLowerCase();

        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(i) !=  str.charAt(str.length() - i -1))
            {
                return false;
            }
        }
         return true;


       
        
    }
}