package com.learning.datastructure.trees;

public class NodeDepths {
    public static int sumNodeDepths(BinaryTree tree) {
        return sumNodeDepthRecursive(tree, 0);
    }

    // Time : O(N)
    // Space : O(H) h being the height of the node.
    // at any point only one branch is calculated.
    private static int sumNodeDepthRecursive(BinaryTree tree, int level) {
        if (tree == null) {
            return 0;
        }
        // return level + recursive (tree.left, level + 1) + recursive (tree.right, level + 1 )
        return level + sumNodeDepthRecursive(tree.left, level + 1) + sumNodeDepthRecursive(tree.right, level + 1);
    }

}
