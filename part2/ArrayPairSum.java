package part2;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length / 2;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += nums[i * 2];
        }
        return count;
    }
}
