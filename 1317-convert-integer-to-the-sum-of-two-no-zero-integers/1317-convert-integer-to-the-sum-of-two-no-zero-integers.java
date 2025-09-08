class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans= new int[2];

        for(int i=1; i<n; i++){
            if(haszero(i)==true) continue;

            ans[0]=i;

            int complement= n-i;
            if(haszero(complement)==false) {
                ans[1]=complement;
                return ans;
            }
        }

        return ans;

    }
}