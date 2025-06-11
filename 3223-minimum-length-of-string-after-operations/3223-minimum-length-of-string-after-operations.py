class Solution:
    def minimumLength(self, s: str) -> int:
        st=Counter(s)
        ans=0
        for c, v in st.items():
            while v>=3:
                v-=2
            ans+=v
        return ans