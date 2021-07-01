package com.learning.datastructure_algorithms.trees;

/**
 * <div ><p>
 *   The distance between a node in a Binary Tree and the tree's root is called the
 *   node's depth.
 * </p>
 * <p>
 *   Write a function that takes in a Binary Tree and returns the sum of its nodes'
 *   depths.
 * </p>
 * <p>
 *   Each <span>BinaryTree</span> node has an integer <span>value</span>, a
 *   <span>left</span> child node, and a <span>right</span> child node. Children
 *   nodes can either be <span>BinaryTree</span> nodes themselves or
 *   <span>None</span> / <span>null</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >tree</span> =    1
 *        /     \
 *       2       3
 *     /   \   /   \
 *    4     5 6     7
 *  /   \
 * 8     9
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>16
 * <span >// The depth of the node with value 2 is 1.</span>
 * <span >// The depth of the node with value 3 is 1.</span>
 * <span >// The depth of the node with value 4 is 2.</span>
 * <span >// The depth of the node with value 5 is 2.</span>
 * <span >// Etc..</span>
 * <span >// Summing all of these depths yields 16.</span>
 * </pre></div>
 */
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
