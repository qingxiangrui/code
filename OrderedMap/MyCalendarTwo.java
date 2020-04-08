//package OrderedMap;
//
//import java.util.TreeMap;
//
//class MyCalendarTwo {
//
//    TreeMap<Integer,Point> treeMap;
//
//    public MyCalendarTwo() {
//        treeMap = new TreeMap<>();
//    }
//
//    public boolean book(int start, int end) {
//        int s,e,curCount,flag = 0;
//        //与start相同
//        Point p1 = treeMap.get(start);
//
//        if (p1 != null) {
//            flag = 1;
//            curCount = p1.count;
//            if (curCount == 2) return false;
//            s = p1.start;
//            e = p1.end;
//            if (end > e) {
//                treeMap.remove(s);
//                treeMap.put(start,new Point(start,e,curCount + 1));
//                treeMap.put(e,new Point(e,end,1));
//            } else if (end == e) {
//                treeMap.remove(s);
//                treeMap.put(start,new Point(start,end,curCount + 1));
//            } else if (end < e) {
//                treeMap.remove(s);
//                treeMap.put(start,new Point(start,end,curCount + 1));
//                treeMap.put(end,new Point(end,e,curCount));
//            }
//        }
//
//        //比start小
//        Integer lowerKey = treeMap.lowerKey(start);
//        if (lowerKey != null) {
//            flag = 1;
//            Point lowerPoint = treeMap.get(lowerKey);
//            curCount = lowerPoint.count;
//            s = lowerKey;
//            e = lowerPoint.end;
//            if (curCount == 2 && e > start) return false;
//
//            if (e <= start) {
//                treeMap.put(start,new Point(start,end,1));
//            }
//            else if (e <= end) {
//                treeMap.remove(lowerKey);
//                treeMap.put(s,new Point(s,start,curCount));
//                treeMap.put(start,new Point(start,e,curCount + 1));
//                treeMap.put(e,new Point(e,end,1));
//            } else if (e > end) {
//                treeMap.remove(lowerKey);
//                treeMap.put(s,new Point(s,start,curCount));
//                treeMap.put(start,new Point(start,end,curCount + 1));
//                treeMap.put(end,new Point(end,e,curCount));
//            }
//        }
//
//        //比start大
//        Integer higherKey = treeMap.higherKey(start);
//        if (higherKey != null) {
//            flag = 1;
//            Point higherPoint = treeMap.get(higherKey);
//            curCount = higherPoint.count;
//            s = higherKey;
//            e = higherPoint.end;
//            if (curCount == 2 && s < end) return false;
//
//            if (s >= end) {
//                treeMap.put(start,new Point(start,end,1));
//            } else if (e < end) {
//                treeMap.remove(higherKey);
//                treeMap.put(start,new Point(start,s,1));
//                treeMap.put(s,new Point(s,e,curCount + 1));
//                treeMap.put(e,new Point(e,end,1));
//            } else if (e == end) {
//                treeMap.remove(higherKey);
//                treeMap.put(start,new Point(start,s,1));
//                treeMap.put(s,new Point(s,e,curCount + 1));
//            } else if (e > end) {
//                treeMap.remove(higherKey);
//                treeMap.put(start,new Point(start,s,1));
//                treeMap.put(s,new Point(s,end,curCount + 1));
//                treeMap.put(end,new Point(end,e,curCount));
//            }
//        }
//        if (flag == 0) {
//            treeMap.put(start,new Point(start,end,1));
//        }
//        return true;
//    }
//
//    class Point {
//        int start;
//        int end;
//        int count;
//
//        public Point(int start, int end, int count) {
//            this.start = start;
//            this.end = end;
//            this.count = count;
//        }
//
//        public int getStart() {
//            return start;
//        }
//
//        public void setStart(int start) {
//            this.start = start;
//        }
//
//        public int getEnd() {
//            return end;
//        }
//
//        public void setEnd(int end) {
//            this.end = end;
//        }
//
//        public int getCount() {
//            return count;
//        }
//
//        public void setCount(int count) {
//            this.count = count;
//        }
//    }
//}
//
///**
// * Your MyCalendarTwo object will be instantiated and called as such:
// * MyCalendarTwo obj = new MyCalendarTwo();
// * boolean param_1 = obj.book(start,end);
// */
package OrderedMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MyCalendarTwo {
    List<int[]> calendar;
    List<int[]> overlaps;

    MyCalendarTwo() {
        calendar = new ArrayList();
        overlaps = new ArrayList();
    }

    public boolean book(int start, int end) {
        for (int[] iv: overlaps) {
            if (iv[0] < end && start < iv[1]) return false;
        }
        for (int[] iv: calendar) {
            if (iv[0] < end && start < iv[1])
                overlaps.add(new int[]{Math.max(start, iv[0]), Math.min(end, iv[1])});
        }
        calendar.add(new int[]{start, end});
        return true;
    }
}

