//package part3;
//
//public class MaximumBinaryTree {
//    public TreeNode constructMaximumBinaryTree(int[] nums) {
//        return constructTree(nums,0,nums.length - 1);
//    }
//
//    private TreeNode constructTree(int[] nums, int low, int high) {
//        if (low > high) {
//            return null;
//        }
//
//        int maxIndex = low;
//        int maxNum = nums[low];
//        for (int i = low + 1; i <= high; i++) {
//            if (nums[i] > maxNum) {
//                maxIndex = i;
//                maxNum = nums[i];
//            }
//        }
//        TreeNode curNode = new TreeNode(maxNum);
//        TreeNode lNode = constructTree(nums,low,maxIndex - 1);
//        TreeNode rNode = constructTree(nums,maxIndex + 1,high);
//        curNode.left = lNode;
//        curNode.right = rNode;
//
//        return curNode;
//    }
//
//    public static void main(String[] args) {
//        MaximumBinaryTree tree = new MaximumBinaryTree();
//        int[] nums = new int[]{3,2,1,6,0,5};
//        tree.constructMaximumBinaryTree(nums);
//    }
//}
//
//
//
// //Definition for a binary tree node.
//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
