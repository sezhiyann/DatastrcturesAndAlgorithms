package com.learning.datastructure.trees;

public class BST {
	public int value;
	public BST left;
	public BST right;

	public BST(int initValue) {
		this.value = initValue;
	}

	public BST insert(int value) {
		BST node = this;
		BST newTree = new BST(value);
		while (node != null) {
			if (value < node.value) {
				if (node.left == null) {
					node.left = newTree;
					break;
				} else {
					node = node.left;
				}
			} else {
				if (node.right == null) {
					node.right = newTree;
					break;
				} else {
					node = node.right;
				}
			}
		}
		return this;
	}

	public boolean contains(int value) {
		BST node = this;
		while (node != null) {
			if (value == node.value) {
				return true;
			} else if (value < node.value) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		return false;
	}

	public BST remove(int value) {
		remove(value, null);
		return this;
	}

	public void remove(int value, BST parentNode) {
		BST currentNode = this; // 5 <- 10 -> 15
		while (currentNode != null) {
			if (value < currentNode.value) {
				parentNode = currentNode;
				currentNode = currentNode.left;
			} else if (value > currentNode.value) {
				parentNode = currentNode;
				currentNode = currentNode.right;
			} else {
				if (currentNode.left != null && currentNode.right != null) {
					currentNode.value = currentNode.right.getMinValue();
					currentNode.right.remove(currentNode.value, currentNode);
				} else if (parentNode == null) {
					//root node
					if (currentNode.left != null) {
						//only has left nodes 
						currentNode.value = currentNode.left.value;
						currentNode.right = currentNode.left.right;
						currentNode.left = currentNode.left.left;
					} else if (currentNode.right != null) {
						//only has right nodes. 
						currentNode.value = currentNode.right.value;
						currentNode.left = currentNode.right.left;
						currentNode.right = currentNode.right.right;
					}
				} else if (parentNode.left == currentNode) {
					parentNode.left = currentNode.left != null ? currentNode.left : currentNode.right;
				} else if (parentNode.right == currentNode) {
					parentNode.right = currentNode.left != null ? currentNode.left : currentNode.right;
				}
				break;
			}
		}
	}

	public int getMinValue() {
		if (left == null) {
			return value;
		} else {
			return left.getMinValue();
		}
	}

	@Override
	public String toString() {
		return traversePreOrder(this);
	}

	public String traversePreOrder(BST root) {

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

	public void traverseNodes(StringBuilder sb, String padding, String pointer, BST node, boolean hasRightSibling) {
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