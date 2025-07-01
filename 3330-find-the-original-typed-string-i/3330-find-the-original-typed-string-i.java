class Solution {
    public int possibleStringCount(String word) {
         int cnt = 1;
        int n = s.length();
        int prev=s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == prev) {
                cnt++;
            }else{
                prev=s.charAt(i);
            }

        }
        return cnt; 
    }
}