class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        min1 = min(nums)
        max1 = max(nums)
        l = []
        for i in range(min1,max1):
            if i not in nums:
                l.append(i)
        
        return l
        