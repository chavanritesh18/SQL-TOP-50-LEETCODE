class Solution {
    public int minMaxDifference(int num) {
          String a=Integer.toString(num);
        String b=a;
        int index=0;
        for(int i=0;i<a.length();i++){
            char t=a.charAt(i);
            if(t!='9'){
                index=i;
                break;
            }
        }
        String a1=a.replace(a.charAt(index),'9');
        String b1=b.replace(b.charAt(0),'0');
        int a2=Integer.parseInt(a1);
        int b2=Integer.parseInt(b1);
        return a2-b2; 
    }
}