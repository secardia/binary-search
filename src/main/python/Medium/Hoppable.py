class Solution:
    def solve(self, nums):
        hops_available = 0
        for i in range(len(nums)):
            num = nums[i]
            if num > hops_available:
                hops_available = num
            if hops_available >= len(nums) - 1 - i:
                return True
            hops_available -= 1
            if hops_available < 0:
                return False
        return False


nums = [1, 0, 0, 0]
expected = False
print(Solution().solve(nums), "expected:", expected)
