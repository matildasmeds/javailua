package javailua;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void testSortEmptyArray() {
        int[] arr = {};
        int[] exp = {};
        assertArrayEquals(exp, MergeSort.sort(arr));
    }

    @Test
    void testSortArray() {
        int[] arr = { 3, 2, 1, 23, 5, 6, 21 };
        int[] exp = { 1, 2, 3, 5, 6, 21, 23 };
        assertArrayEquals(exp, MergeSort.sort(arr));
    }

    @Test
    void testSortArray2() {
        int[] arr = { 52, 56, 3, 83, 34, 86, 85, 13, 98, 60, 41, 57 };
        int[] exp = { 3, 13, 34, 41, 52, 56, 57, 60, 83, 85, 86, 98 };
        assertArrayEquals(exp, MergeSort.sort(arr));
    }
}
