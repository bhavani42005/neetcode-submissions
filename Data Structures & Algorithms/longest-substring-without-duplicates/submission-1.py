class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        Set1 = set()
        l = 0
        res = 0
        for i in range(len(s)):
            while s[i] in Set1:
                Set1.remove(s[l])
                l += 1
            Set1.add(s[i])
            res = max(res,len(Set1))
        return res