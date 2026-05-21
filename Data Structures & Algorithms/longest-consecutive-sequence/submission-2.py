class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num1 = set(nums)
        longest = 0 
        for num in num1 :
            if num-1 not in num1 :
                length = 1
                while(num+length) in num1 :
                    length += 1 
                longest = max(longest , length)
        return longest