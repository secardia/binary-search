class Solution:
    def solve(self, matrix, k):
        one_dim_matrix = []
        for col in matrix:
            for val in col:
                one_dim_matrix.append(val)
        one_dim_matrix.sort()
        return one_dim_matrix[k]


matrix = [
    [1, 3, 30],
    [2, 3, 31],
    [5, 5, 32]
]
k = 4
expected = 5
print('expected:', expected, '/ result:', Solution().solve(matrix, k))
