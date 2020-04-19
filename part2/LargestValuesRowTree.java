package part2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class LargestValuesRowTree {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        LinkedList<TreeNode> link = new LinkedList<>();
        link.add(root);

        while (!link.isEmpty()) {
            int size = link.size();

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode parent = link.pollFirst();
                if (parent.val > max) max = parent.val;
                if (parent.left != null) link.add(parent.left);
                if (parent.right != null) link.add(parent.right);
            }
            list.add(max);
        }
        return list;
    }
}
