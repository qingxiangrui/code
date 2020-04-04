package LineSweep;


import java.util.HashMap;
import java.util.Map;

/**
 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/contains-duplicate-iii
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DuplicateElements {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || nums.length <= 1 ||t < 0) return false;
        Map<Long,Long> bucket = new HashMap<>();
        long bucketWidth = (long)t + 1;

        for (int i = 0; i < nums.length; i++) {
            long bucketId = getId(nums[i],bucketWidth);

            if (bucket.get(bucketId) != null) return true;

            if (bucket.get(bucketId - 1) != null && Math.abs(nums[i] - bucket.get(bucketId - 1)) <= t) return true;

            if (bucket.get(bucketId + 1) != null && Math.abs(nums[i] - bucket.get(bucketId + 1)) <= t) return true;

            bucket.put(bucketId,(long)nums[i]);
            if (i - k >= 0) {
                bucket.remove(getId(nums[i - k],bucketWidth));
            }

        }
        return false;
    }

    private long getId(int value, long width) {
        return value >=0 ? value / width : (value + 1) / width - 1;
    }

}
