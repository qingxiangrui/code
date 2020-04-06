package OrderedMap;

import java.util.TreeMap;

/**
 * 爱丽丝有一手（hand）由整数数组给定的牌。

 现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。

 如果她可以完成分组就返回 true，否则返回 false。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/hand-of-straights
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//下面两个方法应该结合一起  第二个方法有问题
public class StraightHand {
//    public boolean isNStraightHand(int[] hand, int W) {
//        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
//
//        for (int i : hand) {
//            if (!treeMap.containsKey(i)) {
//                treeMap.put(i,1);
//            } else {
//                treeMap.put(i,treeMap.get(i) + 1);
//            }
//        }
//
//        while (treeMap.size() > 0) {
//            Integer first = treeMap.firstKey();
//            for (int i = first; i < first + W; i++) {
//                if (!treeMap.containsKey(i)) return false;
//
//                if (treeMap.get(i) == 1) treeMap.remove(i);
//                else treeMap.put(i,treeMap.get(i) - 1);
//            }
//        }
//        return true;
//    }

    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        int[] temp = new int[W];

        for (int i : hand) {
            temp[i % W]++;
        }

        for (int i = 0; i <= W - 2; i++) {
            if (temp[i] != temp[i + 1]) return false;
        }
        return true;
    }
}
