public class JustAverage {
    public boolean solve(int[] nums, int k) {
        int sum = sum(nums);
        for (int num : nums) {
            double newMean = (sum - num) / (double) (nums.length - 1);
            if (newMean == k) {
                return true;
            }
        }
        return false;
    }

    private int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}