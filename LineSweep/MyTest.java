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

//        DeleteCoveredRange deleteCoveredRange = new DeleteCoveredRange();
//        int[][] intervals = {{1,4},{3,6},{2,8}};
//        int i = deleteCoveredRange.removeCoveredIntervals(intervals);
//        System.out.println(i);

//        DuplicateElements duplicateElements = new DuplicateElements();
//        int[] data = new int[]{-1,2147483647};
//        boolean b = duplicateElements.containsNearbyAlmostDuplicate(data, 1, 2147483647);
//        System.out.println(b);

//        ExamRoom room = new ExamRoom(10);
//        room.seat();
//        room.seat();
//        room.seat();
//        room.seat();
//        room.leave(4);
//        room.seat();

        LFU lfu = new LFU(2);
        lfu.put(1,1);
        lfu.put(2,2);
        System.out.println(lfu.get(1));
        lfu.put(3,3);
        System.out.println(lfu.get(2));
        System.out.println(lfu.get(3));
        lfu.put(4,4);
        System.out.println(lfu.get(1));
        System.out.println(lfu.get(3));
        System.out.println(lfu.get(4));

//        LFU lfu1 = new LFU(0);
//        lfu1.put(0,0);
//        System.out.println(lfu1.get(0));

        /*LFU lfu1 = new LFU(1);
        lfu1.put(2,1);
        System.out.println(lfu1.get(2));
        lfu1.put(3,2);
        System.out.println(lfu1.get(2));
        System.out.println(lfu1.get(3));*/
        //
        //1

        //441 112
        //1 -1 3

//
//
//        LFU lfu = new LFU(3);
//        lfu.put(2,2);
//        lfu.put(1,1);
//        System.out.println(lfu.get(2));
//        System.out.println(lfu.get(1));
//        System.out.println(lfu.get(2));
//        lfu.put(3,3);
//        lfu.put(4,4);
//        System.out.println(lfu.get(3));
//        System.out.println(lfu.get(2));
//        System.out.println(lfu.get(1));
//        System.out.println(lfu.get(4));
//        // 331 112 223
//        //2 1 2
    }
}
