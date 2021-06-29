package com.learning;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Utils {

    /**
     * Time - O(N log(N))
     * [O(N) for reversing, O(N log(N)) for sort which is O(2N log(N)) same as O(Nlog(N)) ignoring constants.]
     * <p>
     * Space - O(1)
     *
     * @param array
     * @param ascending
     * @return
     */
    public static int[] sort(int[] array, boolean ascending) {
        if (isEmpty(array)) {
            return array;
        }

        Arrays.sort(array);
        if (!ascending) {
            reverseArray(array);
        }
        return array;
    }

    //Time : O(N)
    //Space : O(1)
    public static void reverseArray(int[] array) {
        if (isEmpty(array)) {
            return;
        }
        for (int i = 0; i < Math.floor(array.length / 2); i++) {
            int swapIdx = array.length - 1 - i;
            swap(array, i, swapIdx);
        }
    }

    public static void swap(int[] array, int firstIdx, int secondIdx) {
        if (array.length == 0 || firstIdx < 0 || firstIdx > array.length - 1 || secondIdx < 0
                || secondIdx > array.length - 1) {
            return;
        }
        int tmp = array[firstIdx];
        array[firstIdx] = array[secondIdx];
        array[secondIdx] = tmp;
    }

    public static boolean isEmpty(int[] collection) {
        return collection == null || collection.length == 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }



    public static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
