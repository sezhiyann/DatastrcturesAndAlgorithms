package com.learning.datastructure.arrays;

/**
 *<div ><p>
 *   You're given the head of a Singly Linked List whose nodes are in sorted order
 *   with respect to their values. Write a function that returns a modified version
 *   of the Linked List that doesn't contain any nodes with duplicate values. The
 *   Linked List should be modified in place (i.e., you shouldn't create a brand
 *   new list), and the modified Linked List should still have its nodes sorted
 *   with respect to their values.
 * </p>
 * <p></p>
 * <p>
 *   Each <span>LinkedList</span> node has an integer <span>value</span> as well as
 *   a <span>next</span> node pointing to the next node in the list or to
 *   <span>None</span> / <span>null</span> if it's the tail of the list.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span >linkedList</span>
 * = 1 -&gt; 1 -&gt; 3 -&gt; 4 -&gt; 4 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 6 <span >// the head node with value 1</span>
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>1 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 <span >// the head node with value 1</span>
 * </pre></div>
 */
public class LinkedListProblems {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicates(LinkedList linkedList) {
        if (linkedList != null && linkedList.next != null) {
            LinkedList previous = null;
            LinkedList current = linkedList;
            while (current != null) {
                if (previous != null && previous.value == current.value) {
                    previous.next = current.next;
                    //cleaning up references
                    current.next = null;
                    current = previous.next;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        }
        return linkedList;
    }
}
