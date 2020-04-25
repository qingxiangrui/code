//package part3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class AverageOfLevelsinBinaryTree {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> resList = new ArrayList<>();
//        goThroughEachLevel(resList, Arrays.asList(root));
//        return resList;
//    }
//
//    private void goThroughEachLevel(List<Double> resList, List<TreeNode> nodes) {
//        if (nodes.size() <= 0) {
//            return;
//        }
//
//        double sum = 0d;
//        List<TreeNode> subNodes = new ArrayList<>();
//        for (TreeNode node : nodes) {
//            sum += node.val;
//            if (node.left != null) {
//                subNodes.add(node.left);
//            }
//
//            if (node.right != null) {
//                subNodes.add(node.right);
//            }
//        }
//        resList.add(sum / nodes.size());
//        goThroughEachLevel(resList,subNodes);
//    }
//
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
