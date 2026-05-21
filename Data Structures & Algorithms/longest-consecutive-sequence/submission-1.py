class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        min = 0
        for num in nums:
            curr = num
            ct = 0
            while curr in nums :
                curr += 1 
                ct += 1
                min = max(ct,min)
        return min
            