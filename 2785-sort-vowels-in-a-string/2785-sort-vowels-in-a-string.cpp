class Solution {
public:
bool isVowel(char ch)
    {
        ch = tolower(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u';
    }

    string sortVowels(string s) {
        
        vector<int> ans;

        for(char ch : s)
        {
            if(isVowel(ch))
            {
                ans.push_back(ch);
            }
        }

        sort(ans.begin(),ans.end());

        for(int i = 0 , j = 0; i < s.size(); i++)
        {
            if(isVowel(s[i]))
            {
                s[i] = ans[j];
                j++;
            }
        }

        return s;
    }
};