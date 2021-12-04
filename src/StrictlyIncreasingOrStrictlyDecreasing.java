public class StrictlyIncreasingOrStrictlyDecreasing {
    public boolean solve(int[] nums) {
        boolean strictlyIncreasing = true;
        boolean strictlyDecreasing = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return false;
            }
            if (nums[i - 1] > nums[i]) {
                strictlyIncreasing = false;
            } else if (nums[i - 1] < nums[i]) {
                strictlyDecreasing = false;
            }
        }
        return strictlyIncreasing || strictlyDecreasing;
    }
}