package Medium;

import java.util.Arrays;

public class FirstMissingPositive {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int numFound = 0;
        for (int num : nums) {
            if (num == numFound + 1) {
                numFound++;
            }
        }
        return numFound + 1;
    }
}