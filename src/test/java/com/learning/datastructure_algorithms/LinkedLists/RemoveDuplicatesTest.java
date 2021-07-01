package com.learning.datastructure_algorithms.LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        LinkedList list = new LinkedList(1);
        list.next = new LinkedList(1);
        list.next.next = new LinkedList(3);
        list.next.next.next = new LinkedList(4);
        list.next.next.next.next = new LinkedList(4);
        list.next.next.next.next.next = new LinkedList(4);
        list.next.next.next.next.next.next = new LinkedList(5);
        list.next.next.next.next.next.next.next = new LinkedList(6);
        list = RemoveDuplicates.remove(list);

        assertEquals(1, list.value);
        assertEquals(3, list.next.value);
        assertEquals(4, list.next.next.value);
        assertEquals(5, list.next.next.next.value);
        assertEquals(6, list.next.next.next.next.value);
    }

    @Test
    void emptyLinkedList() {
        assertNull(RemoveDuplicates.remove(null));
    }

    @Test
    void singleItemList() {
        LinkedList list = new LinkedList(1);
        LinkedList newList = RemoveDuplicates.remove(list);
        assertEquals(list.value, newList.value);
        assertNull(newList.next);

    }
}