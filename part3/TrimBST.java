package part3;

/**
 *
 * 注意注意！！！！！！！！这里是二叉搜索树，不是任意的二叉树/(ㄒoㄒ)/~~
 */
public class TrimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        return recursiveTrimBST(root,L,R);
    }

    private TreeNode recursiveTrimBST(TreeNode node, int l, int r) {
        if (node == null) {
            return null;
        }

        if (node.val < l) {
            return recursiveTrimBST(node.right,l,r);
        }

        if (node.val > r) {
            return recursiveTrimBST(node.left,l,r);
        }

        TreeNode lNode = recursiveTrimBST(node.left, l, r);
        TreeNode rNode = recursiveTrimBST(node.right, l, r);
        node.left = lNode;
        node.right = rNode;
        return node;
    }
}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

