class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit = 0 
        minbuy = prices[0]
        for price in prices :
            maxprofit = max(maxprofit,price - minbuy)
            minbuy = min(minbuy,price)
        return maxprofit