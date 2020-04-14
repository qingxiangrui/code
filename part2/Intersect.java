package part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null) {
                list.add(i);
                map.put(i,map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}