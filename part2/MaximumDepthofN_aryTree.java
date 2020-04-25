//package part2;
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class MaximumDepthofN_aryTree {
//    public int maxDepth(Node root) {
//        if (root == null) return 0;
//
//        return subTreeMaxDepth(root);
//    }
//
//    private int subTreeMaxDepth(Node node) {
//        if (node == null) return 0;
//        int max = 0;
//
//        for (Node child : node.children) {
//            int subDepth = subTreeMaxDepth(child);
//            if (subDepth > max) max = subDepth;
//        }
//        return max + 1;
//    }
//}
//
//
//// Definition for a Node.
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//
