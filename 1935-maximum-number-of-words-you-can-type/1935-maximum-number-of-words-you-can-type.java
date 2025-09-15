class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String[] word=text.split(" ");
        for(int i=0;i<word.length;i++)
        {
           String wor=word[i];
           boolean flag=false;
           for(int j=0;j<wor.length();j++)
           {
            char ch=wor.charAt(j);
            if( brokenLetters.indexOf(ch)!=-1)
            {
                flag=true;
                break;
            }
           }
           if(!flag)
           {
            count++;
           }
    }
    return count++;
    }
}