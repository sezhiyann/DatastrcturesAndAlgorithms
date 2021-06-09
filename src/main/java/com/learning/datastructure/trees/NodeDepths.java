package com.learning.datastructure.trees;

public class NodeDepths {
	public static int nodeDepths(BinaryTree tree) {
		return nodeDepthsRecursive(tree, 0);
	}

	// Time : O(N)
	// Space : O(H) h being the height of the node. at any point only one branch is
	// calculated.
	private static int nodeDepthsRecursive(BinaryTree tree, int level) {
		// if node is null, return 0
		// return level + recursive (tree.left, level + 1) + recursive (tree.right, level + 1 )
		return -1;
	}

}
