package javailua;

import java.util.Arrays;

// MergeSort time bounds: http://www.cs.toronto.edu/~neto/teaching/238/16/mergesort.html
// MergeSort space bounds: https://stackoverflow.com/questions/10342890/merge-sort-time-and-space-complexity#28641693
public class MergeSort {
    public static int[] sort(int[] array) {
        // Already sorted
        if (array.length < 2) return array;

        // Sort each half
        int k = array.length / 2;
        int[] sortedLeft = sort(Arrays.copyOfRange(array, 0, k));
        int[] sortedRight = sort(Arrays.copyOfRange(array, k, array.length));

        // Merge halves, so that merged array is sorted
        int[] merged = new int[array.length];
        int i = 0;
        int j = 0;
        for (int index=0; index<array.length; index++) {
            if (i < sortedLeft.length && j < sortedRight.length) {
                if (sortedLeft[i] < sortedRight[j]) {
                    merged[index] = sortedLeft[i++];
                } else {
                    merged[index] = sortedRight[j++];
                }
            } else {
                if (i < sortedLeft.length) {
                    merged[index] = sortedLeft[i++];
                } else {
                    merged[index] = sortedRight[j++];
                }
            }
        }
        return merged;
    }

    public static void print(int[] array) {
        for (int i: array) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] sortMe = { 3, 2, 1, 23, 5, 6, 21 };
        MergeSort.print(MergeSort.sort(sortMe));
    }
}
