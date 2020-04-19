/*
package part2;

import java.util.*;

//Definition for a binary tree node.
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class FindFrequentTreeSum {
    private int subTreeSum(TreeNode node, HashMap<Integer, Integer> sumMap) {
        if (node == null) return 0;

        if (node.left == null && node.right == null) {
            int value = sumMap.getOrDefault(node.val,0);
            sumMap.put(node.val,value + 1);
            return node.val;
        }

        int leftSum = subTreeSum(node.left,sumMap);
        int rightSum = subTreeSum(node.right,sumMap);
        int value = sumMap.getOrDefault(node.val + leftSum + rightSum,0);
        sumMap.put(node.val + leftSum + rightSum,value + 1);
        return node.val + leftSum + rightSum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> sumMap = new HashMap<>();

        subTreeSum(root,sumMap);

        List<Integer> list = new ArrayList<>();

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : sumMap.entrySet()) {
            if (entry.getValue() < max) {
                continue;
            } else if (entry.getValue() == max) {
                list.add(entry.getKey());
            } else {
                max = entry.getValue();
                list.clear();
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
*/
