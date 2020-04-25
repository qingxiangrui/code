package part3;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }

        recursivePostorder(root,resList);
        return resList;
    }

    private void recursivePostorder(Node node, List<Integer> resList) {
        if (node == null) {
            return;
        }

        List<Node> childs = node.children;
        if (!childs.isEmpty()) {
            for (Node child : childs) {
                recursivePostorder(child,resList);
            }
        }
        resList.add(node.val);
    }
}


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
