package com.learning.datastructure.trees;

import java.util.ArrayList;
import java.util.List;

public class SumOfBranches {

	public static List<Integer> sumOfBranches(BinaryTree tree) {
		List<Integer> sums = new ArrayList<>();
		sumOfBranches(tree, 0, sums);		
		return sums;
	}
	
	public static void sumOfBranches(BinaryTree tree, int sum, List<Integer> sums) {
		//tree is null, return
		//sum with tree.value 
		//if left and right are null, add it to sums (meaning this is the leaf node)
		//do sumofbranches for left
		//do sumof branches for right.
		
	}
	 
}
