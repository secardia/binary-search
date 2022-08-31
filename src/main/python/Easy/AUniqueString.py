from re import S


class Solution:
    def solve(self, s):
        already_crossed = []
        for char in s:
            if char in already_crossed:
                return False
            else:
                already_crossed.append(char)
        return True


s = "abcde"
expected = True
print('expected:', expected, '/ result:', Solution().solve(s))
