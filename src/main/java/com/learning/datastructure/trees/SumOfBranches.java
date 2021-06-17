package com.learning.datastructure.trees;

import java.util.ArrayList;
import java.util.List;

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
