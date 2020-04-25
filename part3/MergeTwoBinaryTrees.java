//package part3;
//
//public class MergeTwoBinaryTrees {
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        return recursiveMergeTrees(t1,t2);
//    }
//
//    private TreeNode recursiveMergeTrees(TreeNode t1, TreeNode t2) {
//        if (t1 == null) {
//            return t2;
//        }
//
//        if (t2 == null) {
//            return t1;
//        }
//
//        TreeNode lNode = recursiveMergeTrees(t1.left, t2.left);
//        TreeNode rNode = recursiveMergeTrees(t1.right, t2.right);
//        TreeNode mergeNode = new TreeNode(t1.val + t2.val);
//        mergeNode.left = lNode;
//        mergeNode.right = rNode;
//        return mergeNode;
//    }
//}
//
//
////Definition for a binary tree node.
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
//
