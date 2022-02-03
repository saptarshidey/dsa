package com.saptarshi.datastructure.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = rnd.nextInt(100);
        }

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(numbers));

        QuickSort.sort(numbers);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(numbers));
    }

    /*s
     * An overloaded sort method without array bounds which is more natural to invoke from main()
     */
    private static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int pos = partition(arr, lb, ub);

            sort(arr, lb, pos - 1);
            sort(arr, pos + 1, ub);
        }
    }

    /*
     * Partition the array such the pivot elements finds its appropriate position in the array.
     * All elements less than the pivot are moved to the left and all elements greater than the
     * pivot are moved to the right. Returns the pivot index
     */
    private static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[ub];

        int pivotIndex = lb;
        for (int i = lb; i < ub; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, ub);

        return pivotIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
