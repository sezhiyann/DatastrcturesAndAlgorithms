package com.learning.datastructure.trees;

public class BinaryTree  {
	public int value;
	public BinaryTree left;
	public BinaryTree right;

	public BinaryTree(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return traversePreOrder(this);
	}

	public String traversePreOrder(BinaryTree root) {

		if (root == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		sb.append(root.value);

		String pointerRight = "└──";
		String pointerLeft = (root.right != null) ? "├──" : "└──";

		traverseNodes(sb, "", pointerLeft, root.left, root.right != null);
		traverseNodes(sb, "", pointerRight, root.right, false);

		return sb.toString();
	}

	public void traverseNodes(StringBuilder sb, String padding, String pointer, BinaryTree node, boolean hasRightSibling) {
		if (node != null) {
			sb.append("\n");
			sb.append(padding);
			sb.append(pointer);
			sb.append(node.value);

			StringBuilder paddingBuilder = new StringBuilder(padding);
			if (hasRightSibling) {
				paddingBuilder.append("│  ");
			} else {
				paddingBuilder.append("   ");
			}

			String paddingForBoth = paddingBuilder.toString();
			String pointerRight = "└──";
			String pointerLeft = (node.right != null) ? "├──" : "└──";

			traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
			traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
		}
	}
}
