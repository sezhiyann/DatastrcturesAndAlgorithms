package com.learning.datastructure.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Node {
	public String name;
	public List<Node> children = new ArrayList<>();

	public Node(String name) {
		this.name = name;
	}

	public Node addChild(String name) {
		Node child = new Node(name);
		children.add(child);
		return this;
	}

	// Time : O(V+E) - number of vertices, no of children/edges.
	public List<String> depthFirstSearch(List<String> array) {
		// Write your code here.
		array.add(name);
		if (children != null && children.size() > 0) {
			for (int i = 0; i < children.size(); i++) {
				children.get(i).depthFirstSearch(array);
			}
		}
		return array;
	}

	
	public List<String> breadthFirstSearch(List<String> array) {
		// Write your code here.
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(this);
		// breadthFirstSearch(this, queue, array);
		while (queue.size() > 0) {
			Node node = queue.poll();
			array.add(node.name);

			if (node.children != null && node.children.size() > 0) {
				for (int i = 0; i < node.children.size(); i++) {
					queue.add(node.children.get(i));
				}
			}
		}
		return array;
	}

}
