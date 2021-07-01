package com.learning.datastructure_algorithms.graphs.search;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.learning.datastructure_algorithms.graphs.Node;

class BreadFirstSearchTest {

	@Test
	public void TestCase1() {
		Node graph = new Node("A");
		graph.addChild("B").addChild("C").addChild("D");
		graph.children.get(0).addChild("E").addChild("F");
		graph.children.get(2).addChild("G").addChild("H");
		graph.children.get(0).children.get(1).addChild("I").addChild("J");
		graph.children.get(2).children.get(0).addChild("K");
		String[] expected = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" };
		List<String> inputArray = new ArrayList<>();
		assertTrue(compare(graph.breadthFirstSearch(inputArray), expected));
	}
	

	  public static boolean compare(List<String> arr1, String[] arr2) {
	    if (arr1.size() != arr2.length) {
	      return false;
	    }
	    for (int i = 0; i < arr1.size(); i++) {
	      if (!arr1.get(i).equals(arr2[i])) {
	        return false;
	      }
	    }
	    return true;
	  }
}
