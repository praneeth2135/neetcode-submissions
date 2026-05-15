class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        ans=False
        nums.sort()
        for i in range(1, len(nums)):
            if(nums[i-1]==nums[i]):
                ans=True
        return ans
        