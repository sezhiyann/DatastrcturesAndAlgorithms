package com.learning.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListProblemsTest {

    @Test
    void removeDuplicates() {
        LinkedListProblems.LinkedList list = new LinkedListProblems.LinkedList(1);
        list.next = new LinkedListProblems.LinkedList(1);
        list.next.next = new LinkedListProblems.LinkedList(3);
        list.next.next.next = new LinkedListProblems.LinkedList(4);
        list.next.next.next.next = new LinkedListProblems.LinkedList(4);
        list.next.next.next.next.next = new LinkedListProblems.LinkedList(4);
        list.next.next.next.next.next.next = new LinkedListProblems.LinkedList(5);
        list.next.next.next.next.next.next.next = new LinkedListProblems.LinkedList(6);
        list = LinkedListProblems.removeDuplicates(list);

        assertEquals(1, list.value);
        assertEquals(3, list.next.value);
        assertEquals(4, list.next.next.value);
        assertEquals(5, list.next.next.next.value);
        assertEquals(6, list.next.next.next.next.value);
    }

    @Test
    void emptyLinkedList() {
        assertNull(LinkedListProblems.removeDuplicates(null));
    }

    @Test
    void singleItemList() {
        LinkedListProblems.LinkedList list = new LinkedListProblems.LinkedList(1);
        LinkedListProblems.LinkedList newList = LinkedListProblems.removeDuplicates(list);
        assertEquals(list.value, newList.value);
        assertNull(newList.next);

    }
}