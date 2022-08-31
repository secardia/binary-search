class Solution:
    def solve(self, shows, durations, k):
        if k == 0:
            return 0
        sum_times = {}
        for show, duration in zip(shows, durations):
            if show not in sum_times:
                sum_times[show] = 0
            sum_times[show] += duration
        result = 0
        i = 0
        for value in sorted(sum_times.values(), reverse=True):
            i += 1
            result += value
            if i == k:
                return result


shows = ["Top Gun", "Aviator", "Top Gun", "Roma", "Logan"]
durations = [5, 3, 5, 13, 4]
k = 2
expected = 23
print('expected:', expected, '/ result:',
      Solution().solve(shows, durations, k))
