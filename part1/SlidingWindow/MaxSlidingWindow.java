package part1.SlidingWindow;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k) return new int[0];

        int len = nums.length;
        int[] maxWindow = new int[len - k + 1];
        maxWindow[0] = maxK(nums,0,k);

        for (int i = 1; i < maxWindow.length; i++) {
            maxWindow[i] = Math.max(maxWindow[i - 1],nums[i + k - 1]);
        }
        return maxWindow;
    }

    private int maxK(int[] nums, int i, int k) {
        int max = nums[i];
        for (int j = i + 1; j < k; j++) {
            if (nums[j] > max) max = nums[j];
        }
        return max;
    }
}
