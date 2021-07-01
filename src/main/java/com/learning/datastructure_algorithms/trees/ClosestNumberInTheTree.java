package com.learning.datastructure_algorithms.trees;

/**
 * <div ><p>
 *   Write a function that takes in a Binary Search Tree (BST) and a target integer
 *   value and returns the closest value to that target value contained in the BST.
 * </p>
 * <p>You can assume that there will only be one closest value.</p>
 * <p>
 *   Each <span>BST</span> node has an integer <span>value</span>, a
 *   <span>left</span> child node, and a <span>right</span> child node. A node is
 *   said to be a valid <span>BST</span> node if and only if it satisfies the BST
 *   property: its <span>value</span> is strictly greater than the values of every
 *   node to its left; its <span>value</span> is less than or equal to the values
 *   of every node to its right; and its children nodes are either valid
 *   <span>BST</span> nodes themselves or <span>None</span> / <span>null</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >tree</span> =   10
 *        /     \
 *       5      15
 *     /   \   /   \
 *    2     5 13   22
 *  /           \
 * 1            14
 * <span >target</span> = 12
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>13</pre></div>
 */

public class ClosestNumberInTheTree {

	// assumption there will be atleast one
	//TODO: test cases
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
