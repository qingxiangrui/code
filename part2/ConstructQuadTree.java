//package part2;
//
//public class ConstructQuadTree {
//    public Node construct(int[][] grid) {
//        return buildTree(grid,0,0,grid.length);
//    }
//
//    private Node buildTree(int[][] grid, int col, int row, int len) {
//        int sum = 0;
//
//        for (int i = col; i < col + len; i++) {
//            for (int j = row; j < row + len; j++) {
//                if (grid[j][i] == 1) sum++;
//            }
//        }
//
//        Node node = null;
//        if (sum == 0) {
//            node = new Node(false,true,null,null,null,null);
//        } else if (sum == len * len) {
//            node = new Node(true,true,null,null,null,null);
//        } else {
//            Node topLeft = buildTree(grid,col,row,len / 2);
//            Node topRight = buildTree(grid,col + len / 2,row,len / 2);
//            Node bottomLeft = buildTree(grid,col,row + len / 2,len / 2);
//            Node bottomRight = buildTree(grid,col + len / 2,row + len / 2,len / 2);
//            node = new Node(true,false,topLeft,topRight,bottomLeft,bottomRight);
//        }
//        return node;
//    }
//}
//
//
//// Definition for a QuadTree node.
////class Node {
////    public boolean val;
////    public boolean isLeaf;
////    public Node topLeft;
////    public Node topRight;
////    public Node bottomLeft;
////    public Node bottomRight;
////
////
////    public Node() {
////        this.val = false;
////        this.isLeaf = false;
////        this.topLeft = null;
////        this.topRight = null;
////        this.bottomLeft = null;
////        this.bottomRight = null;
////    }
////
////    public Node(boolean val, boolean isLeaf) {
////        this.val = val;
////        this.isLeaf = isLeaf;
////        this.topLeft = null;
////        this.topRight = null;
////        this.bottomLeft = null;
////        this.bottomRight = null;
////    }
////
////    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
////        this.val = val;
////        this.isLeaf = isLeaf;
////        this.topLeft = topLeft;
////        this.topRight = topRight;
////        this.bottomLeft = bottomLeft;
////        this.bottomRight = bottomRight;
////    }
////}
////
