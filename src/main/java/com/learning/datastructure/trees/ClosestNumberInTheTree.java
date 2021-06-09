package com.learning.datastructure.trees;

public class ClosestNumberInTheTree {

	// assumption there will be atleast one
	public static int closesNumberInTheTree(BST root, int target) {
		int closest = root.value;
		BST currentNode = root;
		while (currentNode != null) {
			if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
				closest = currentNode.value;
			}

			if (target > currentNode.value) {
				currentNode = currentNode.right;
			} else {
				currentNode = currentNode.left;
			}
		}
		return closest;
	}
}
