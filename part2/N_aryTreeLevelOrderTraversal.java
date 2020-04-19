//package part2;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//
//
////// Definition for a Node.
////class Node {
////    public int val;
////    public List<Node> children;
////
////    public Node() {}
////
////    public Node(int _val) {
////        val = _val;
////    }
////
////    public Node(int _val, List<Node> _children) {
////        val = _val;
////        children = _children;
////    }
////}
//
//
//public class N_aryTreeLevelOrderTraversal {
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> resList = new ArrayList<>();
//        if (root == null) return resList;
//
//        LinkedList<Node> queue = new LinkedList<>();
//        queue.addLast(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> curList = new ArrayList<>();
//
//            for (int i = 0; i < size; i++) {
//                Node father = queue.pollFirst();
//                curList.add(father.val);
//                queue.addAll(father.children);
//            }
//            resList.add(curList);
//        }
//        return resList;
//    }
//}
//
