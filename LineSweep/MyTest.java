package LineSweep;


import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
//        OrderArray orderArray = new OrderArray();
//
//        int[] arr = new int[]{5,1,1,2,0,0};
//
//        orderArray.sortArray(arr);
//
//        for (int i : arr) {
//            System.out.println(i);
//
//        }
        DeleteCoveredRange deleteCoveredRange = new DeleteCoveredRange();
        int[][] intervals = {{1,4},{3,6},{2,8}};
        int i = deleteCoveredRange.removeCoveredIntervals(intervals);
        System.out.println(i);
    }
}
