package part2;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> resList = new ArrayList<>();

        if (root == null) {
            return resList;
        }

        preorderRecurve(root,resList);
        return resList;
    }

    private void preorderRecurve(Node node, List<Integer> resList) {
        if (node == null) {
            return;
        }

        resList.add(node.val);
        for (Node child : node.children) {
            preorderRecurve(child,resList);
        }
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
}

