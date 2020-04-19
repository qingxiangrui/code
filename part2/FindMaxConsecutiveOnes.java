package part2;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                curCount = 0;
            } else {
                curCount++;
            }
            max = Math.max(max,curCount);
        }
        return max;
    }
}
