class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        if nums is None or len(nums) == 0:
            return []
        if len(nums) == 1:
            return [[nums[0]]]
        if len(nums) == 2:
            return [[nums[0],nums[1]], [nums[1],nums[0]]]
        result = []
        for num in nums:
            tmp = nums.copy()
            tmp.remove(num)
            pre_res = self.permute(tmp)
            for arr in pre_res:
                result.append([num] + arr)
            
        return result