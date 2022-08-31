class Solution:
    def solve(self, nums):
        sums = []
        for num in nums:
            if len(sums) == 0:
                sums.append(num)
            else:
                sums.append(max(0, sums[-1]) + num)
        return max(sums)


nums = [10, -5, 12, -100, 3, -1, 20]
expected = 22
print('expected:', expected, '/ result:', Solution().solve(nums))
