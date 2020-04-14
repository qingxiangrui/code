package part2;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //方法1
//    public int majorityElement(int[] nums) {
//        int maxNum = -9999;
//        int maxCount = 0;
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
//            if (map.get(nums[i]) > maxCount) {
//                maxNum = nums[i];
//                maxCount = map.get(nums[i]);
//            }
//        }
//        return maxNum;
//    }

    //方法2
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
