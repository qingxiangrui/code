package part2;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {

        Map<Integer,Integer> distanceMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < points.length; i++) {
            distanceMap.clear();
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int distance = (int)(Math.pow(points[i][0] - points[j][0],2) + Math.pow(points[i][1] - points[j][1],2));

                distanceMap.put(distance,distanceMap.getOrDefault(distance,0) + 1);
            }
            for (Integer dis : distanceMap.keySet()) {
                Integer num = distanceMap.get(dis);
                if (num >= 2) {
                    count += num * (num - 1);
                }
            }
        }
        return count;
    }
}
