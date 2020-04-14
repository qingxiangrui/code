package part2;

import java.util.HashMap;
import java.util.Map;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
            if (map.get(num) >= 2) return true;
        }
        return false;
    }
}