class Solution:
    def solve(self, matrix):
        # check empty matrix
        nb_ennemies = 0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                cell = matrix[i][j]
                if cell == 2:
                    nb_ennemies += 1
        if nb_ennemies == 0:
            return 0
        # check matrix
        max_kills = 0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                cell = matrix[i][j]
                if cell == 0:  # can place a bombe
                    max_kills = max(max_kills, self.computeKills(matrix, i, j))
        return max_kills

    def computeKills(self, matrix, x, y):
        nb_kills = 0
        # up
        i = x - 1
        while i >= 0 and matrix[i][y] != 1:
            if matrix[i][y] == 2:
                nb_kills += 1
            i -= 1
        # down
        i = x + 1
        while i < len(matrix) and matrix[i][y] != 1:
            if matrix[i][y] == 2:
                nb_kills += 1
            i += 1
        # left
        j = y - 1
        while j >= 0 and matrix[x][j] != 1:
            if matrix[x][j] == 2:
                nb_kills += 1
            j -= 1
        # right
        j = y + 1
        while j < len(matrix[0]) and matrix[x][j] != 1:
            if matrix[x][j] == 2:
                nb_kills += 1
            j += 1
        return nb_kills


matrix = [
    [0, 2, 2, 0],
    [0, 2, 0, 2],
    [0, 1, 1, 0],
    [0, 0, 2, 0]
]
expected = 3
print(Solution().solve(matrix), "expected:", expected)

matrix = [
    [0, 2]
]
expected = 1
print(Solution().solve(matrix), "expected:", expected)

matrix = [
    [2, 0, 2, 2, 0, 1]
]
expected = 3
print('expected:', expected, '/ result:', Solution().solve(matrix))
