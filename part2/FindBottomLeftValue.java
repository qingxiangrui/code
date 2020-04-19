//package part2;
//
//
//import java.util.LinkedList;
//
////Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
//
//
//public class FindBottomLeftValue {
//    public int findBottomLeftValue(TreeNode root) {
//        LinkedList<TreeNode> link = new LinkedList<>();
//        link.add(root);
//
//        int leftFirst = 0;
//        while (!link.isEmpty()) {
//            int size = link.size();
//
//            for (int i = 0; i < size; i++) {
//                TreeNode parent = link.pollFirst();
//                if (i == 0) {
//                    leftFirst = parent.val;
//                }
//                if (parent.left != null) link.add(parent.left);
//                if (parent.right != null) link.add(parent.right);
//            }
//        }
//        return leftFirst;
//    }
//}
