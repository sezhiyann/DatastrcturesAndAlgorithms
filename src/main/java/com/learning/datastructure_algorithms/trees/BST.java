package com.learning.datastructure_algorithms.trees;

/**
 * <div ><p>
 *   Write a <span>BST</span> class for a Binary Search Tree. The class should
 *   support:
 * </p>
 * <ul>
 *   <li>Inserting values with the <span>insert</span> method.</li>
 *   <li>
 *     Removing values with the <span>remove</span> method; this method should
 *     only remove the first instance of a given value.
 *   </li>
 *   <li>Searching for values with the <span>contains</span> method.</li>
 * </ul>
 * <p>
 *   Note that you can't remove values from a single-node tree. In other words,
 *   calling the <span>remove</span> method on a single-node tree should simply not
 *   do anything.
 * </p>
 * <p>
 *   Each <span>BST</span> node has an integer <span>value</span>, a
 *   <span>left</span> child node, and a <span>right</span> child node. A node is
 *   said to be a valid <span>BST</span> node if and only if it satisfies the BST
 *   property: its <span>value</span> is strictly greater than the values of every
 *   node to its left; its <span>value</span> is less than or equal to the values
 *   of every node to its right; and its children nodes are either valid
 *   <span>BST</span> nodes themselves or <span>None</span> / <span>null</span>.
 * </p>
 * <h3>Sample Usage</h3>
 * <pre><span >// Assume the following BST has already been created:</span>
 *          10
 *        /     \
 *       5      15
 *     /   \   /   \
 *    2     5 13   22
 *  /           \
 * 1            14
 *
 * <span >// All operations below are performed sequentially.</span>
 * <span >insert</span>(12):   10
 *             /     \
 *            5      15
 *          /   \   /   \
 *         2     5 13   22
 *       /        /  \
 *      1        12  14
 *
 * <span >remove</span>(10):   12
 *             /     \
 *            5      15
 *          /   \   /   \
 *         2     5 13   22
 *       /           \
 *      1            14
 *
 * <span >contains</span>(15): true
 * </pre></div>
 */
public class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int initValue) {
        this.value = initValue;
    }

    @SuppressWarnings("ConstantConditions")
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


    /**
     * <div ><p>
     *   Write a function that takes in a potentially invalid Binary Search Tree (BST)
     *   and returns a boolean representing whether the BST is valid.
     * </p>
     * <p>
     *   Each <span>BST</span> node has an integer <span>value</span>, a
     *   <span>left</span> child node, and a <span>right</span> child node. A node is
     *   said to be a valid <span>BST</span> node if and only if it satisfies the BST
     *   property: its <span>value</span> is strictly greater than the values of every
     *   node to its left; its <span>value</span> is less than or equal to the values
     *   of every node to its right; and its children nodes are either valid
     *   <span>BST</span> nodes themselves or <span>None</span> / <span>null</span>.
     * </p>
     * <p>
     *   A BST is valid if and only if all of its nodes are valid
     *   <span>BST</span> nodes.
     * </p>
     * <h3>Sample Input</h3>
     * <pre><span >tree</span> =   10
     *        /     \
     *       5      15
     *     /   \   /   \
     *    2     5 13   22
     *  /           \
     * 1            14
     * </pre>
     * <h3>Sample Output</h3>
     * <pre>true</pre></div>
     * <p>
     * Time : O(N)
     * Space : O(D) - depth of the tree.
     */
    public static boolean isValid(BST tree) {
        return isValid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValid(BST tree, int minValue, int maxValue) {
        if (tree == null) {
            return true;
        }
        if (tree.value < minValue || tree.value >= maxValue) {
            return false;
        }

        if (!isValid(tree.left, minValue, tree.value)) {
            return false;
        }

        return isValid(tree.right, tree.value, maxValue);
    }
}