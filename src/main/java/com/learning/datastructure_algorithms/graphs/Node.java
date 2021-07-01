package com.learning.datastructure_algorithms.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Node {
    public final String name;
    public final List<Node> children = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
    }

    /**
     * <div ><p>
     *   You're given a <span>Node</span> class that has a <span>name</span> and an
     *   array of optional <span>children</span> nodes. When put together, nodes form
     *   an acyclic tree-like structure.
     * </p>
     * <p>
     *   Implement the <span>depthFirstSearch</span> method on the
     *   <span>Node</span> class, which takes in an empty array, traverses the tree
     *   using the Depth-first Search approach (specifically navigating the tree from
     *   left to right), stores all of the nodes' names in the input array, and returns
     *   it.
     * </p>
     * <p>
     *   If you're unfamiliar with Depth-first Search, we recommend watching the
     *   Conceptual Overview section of this question's video explanation before
     *   starting to code.
     * </p>
     * <h3>Sample Input</h3>
     * <pre><span >graph</span> =
     *         A
     *      /  |  \
     *     B   C   D
     *    / \     / \
     *   E   F   G   H
     *      / \   \
     *     I   J   K
     * </pre>
     * <h3>Sample Output</h3>
     * <pre>["A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"]
     * </pre></div>
     * <p>
     * Time : O(V+E) - number of vertices, no of children/edges.
     *
     * @param array
     * @return
     */
    @SuppressWarnings("UnusedReturnValue")
    public List<String> depthFirstSearch(List<String> array) {
        // Write your code here.
        array.add(name);
        for (Node child : children) {
            child.depthFirstSearch(array);
        }
        return array;
    }

    /**
     * <div ><p>
     *   You're given a <span>Node</span> class that has a <span>name</span> and an
     *   array of optional <span>children</span> nodes. When put together, nodes form
     *   an acyclic tree-like structure.
     * </p>
     * <p>
     *   Implement the <span>breadthFirstSearch</span> method on the
     *   <span>Node</span> class, which takes in an empty array, traverses the tree
     *   using the Breadth-first Search approach (specifically navigating the tree from
     *   left to right), stores all of the nodes' names in the input array, and returns
     *   it.
     * </p>
     * <p>
     *   If you're unfamiliar with Breadth-first Search, we recommend watching the
     *   Conceptual Overview section of this question's video explanation before
     *   starting to code.
     * </p>
     * <h3>Sample Input</h3>
     * <pre><span >graph</span> =
     *         A
     *      /  |  \
     *     B   C   D
     *    / \     / \
     *   E   F   G   H
     *      / \   \
     *     I   J   K
     * </pre>
     * <h3>Sample Output</h3>
     * <pre>["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"]
     * </pre></div>
     *
     * @param array
     * @return
     */
    public List<String> breadthFirstSearch(List<String> array) {
        // Write your code here.
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(this);
        // breadthFirstSearch(this, queue, array);
        while (queue.size() > 0) {
            Node node = queue.poll();
            array.add(node.name);
            queue.addAll(node.children);
        }
        return array;
    }

}
