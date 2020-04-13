package part1.LineSweep;

import java.util.Arrays;

/**
 * 给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。

 只有当 c <= a 且 b <= d 时，我们才认为区间 [a,b) 被区间 [c,d) 覆盖。

 在完成所有删除操作后，请你返回列表中剩余区间的数目。
 */
public class DeleteCoveredRange {
    public int removeCoveredIntervals(int[][] intervals) {
        if (intervals == null) return -1;

        int length = intervals.length;
        if (length == 0 || length == 1) return length;

        Arrays.sort(intervals,(n0,n1) -> n0[0] != n1[0] ? n0[0] - n1[0] : n1[1] - n0[1]);
        int max = intervals[0][1],res = length;

        for (int i = 1; i < length; i++) {
            if (max >= intervals[i][1]) res--;
            else max = intervals[i][1];
        }
        return res;
    }
}
