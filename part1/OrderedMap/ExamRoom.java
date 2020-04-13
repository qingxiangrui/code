package part1.OrderedMap;

import java.util.TreeSet;

/**
 * 在考场里，一排有 N 个座位，分别编号为 0, 1, 2, ..., N-1 。

 当学生进入考场后，他必须坐在能够使他与离他最近的人之间的距离达到最大化的座位上。如果有多个这样的座位，
 他会坐在编号最小的座位上。(另外，如果考场里没有人，那么学生就坐在 0 号座位上。)

 返回 ExamRoom(int N) 类，它有两个公开的函数：其中，函数 ExamRoom.seat() 会返回一个 int （整型数据），
 代表学生坐的位置；函数 ExamRoom.leave(int p) 代表坐在座位 p 上的学生现在离开了考场。每次调用 ExamRoom.leave(p) 时都保证有学生坐在座位 p 上。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/exam-room
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ExamRoom {
    private TreeSet<Integer> set;
    private int N;

    public ExamRoom(int N) {
        this.N = N;
        set = new TreeSet<>();
    }

    public int seat() {
        int stuPos = 0,dist = 0;
        Integer prev = null;

        if (set.size() > 0) {
            //此处需要使用first的，为什么不直接使用0的原因（因为正常来说0就是最小的）----》调用leave函数可能0已经消除了  ，最小的可能不是0
            dist = set.first();
            for (Integer value : set) {
                if (prev != null) {
                    int temp = (value - prev) / 2;
                    if (temp > dist) {
                        dist = temp;
                        stuPos = prev + dist;
                    }
                }
                prev = value;
            }
            if (N - 1 - set.last() > dist) {
                stuPos = N - 1;
            }
        }

        set.add(stuPos);
        return stuPos;
    }

    public void leave(int p) {
        set.remove(p);
    }
}
