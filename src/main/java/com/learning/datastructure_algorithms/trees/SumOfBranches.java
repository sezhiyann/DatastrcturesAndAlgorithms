package com.learning.datastructure_algorithms.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * <div ><p>
 *   Write a function that takes in a Binary Tree and returns a list of its branch
 *   sums ordered from leftmost branch sum to rightmost branch sum.
 * </p>
 * <p>
 *   A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
 *   branch is a path of nodes in a tree that starts at the root node and ends at
 *   any leaf node.
 * </p>
 * <p>
 *   Each <span>BinaryTree</span> node has an integer <span>value</span>, a
 *   <span>left</span> child node, and a <span>right</span> child node. Children
 *   nodes can either be <span>BinaryTree</span> nodes themselves or
 *   <span>None</span> / <span>null</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >tree</span> =     1
 *         /     \
 *        2       3
 *      /   \    /  \
 *     4     5  6    7
 *   /   \  /
 *  8    9 10
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[15, 16, 18, 10, 11]
 * <span >// 15 == 1 + 2 + 4 + 8</span>
 * <span >// 16 == 1 + 2 + 4 + 9</span>
 * <span >// 18 == 1 + 2 + 5 + 10</span>
 * <span >// 10 == 1 + 3 + 6</span>
 * <span >// 11 == 1 + 3 + 7</span>
 * </pre></div>
 */
public class SumOfBranches {

    public static List<Integer> sum(BinaryTree tree) {
        List<Integer> sums = new ArrayList<>();
        sum(tree, 0, sums);
        return sums;
    }

    /**
     * Time : O(N)
     * Space : O(N)
     */
    public static void sum(BinaryTree tree, int sumTillNow, List<Integer> listOfSums) {
        //tree is null, return
        if (tree == null) {
            return;
        }
        //sum with tree.value
        int sum = sumTillNow + tree.value;

        //if left and right are null, add it to listOfSums (meaning this is the leaf node)
        if (tree.left == null && tree.right == null) {
            listOfSums.add(sum);
            return;
        }
        //do sumofbranches for left
        if (tree.left != null) {
            sum(tree.left, sum, listOfSums);
        }

        //do sumof branches for right.
        if (tree.right != null) {
            sum(tree.right, sum, listOfSums);
        }
    }

}
