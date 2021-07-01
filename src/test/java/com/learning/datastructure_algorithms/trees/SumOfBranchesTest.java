package com.learning.datastructure_algorithms.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SumOfBranchesTest {

    @Test
    void sumOfBranches() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);

        root.left.right = new BinaryTree(5);
        root.left.right.left = new BinaryTree(10);

        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        List<Integer> expectedSums = Arrays.asList();
        List<Integer> actualSums = SumOfBranches.sum(root);
        Assertions.assertArrayEquals(new Integer[]{15, 16, 18, 10, 11}, actualSums.toArray());
    }
}