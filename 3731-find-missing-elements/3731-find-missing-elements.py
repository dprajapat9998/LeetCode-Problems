class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        # min1 = min(nums)
        # max1 = max(nums)
        min2 = 101
        max2 = 0
        for i in nums:
            if i>max2:
                max2 = i
            if i<min2:
                min2 = i
        
        l = []
        for i in range(min2,max2):
            if i not in nums:
                l.append(i)
        
        return l
        