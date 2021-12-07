package Medium;

public class LargestSumOfNonAdjacentNumbers {
    public int solve(int[] nums) {
        int[] dp = new int[nums.length + 2];
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 2; i < nums.length + 2; i++) {
            if (nums[i - 2] > 0) {
                dp[i] = Math.max(dp[i - 2] + nums[i - 2], dp[i - 1]);
            } else {
                dp[i] = Math.max(dp[i - 2], dp[i - 1]);
            }
        }
        return dp[nums.length + 1];
    }
}