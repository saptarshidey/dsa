package com.saptarshi.datastructure.sorting;

import java.util.Arrays;
import java.util.Random;

public class BogoSort {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = rnd.nextInt(100);
        }

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(numbers));

        BogoSort.sort(numbers);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(numbers));
    }

    // Worst sorting algorithm. Complexity: O(n!)
    private static void sort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    private static boolean isSorted(int[] arr) {
        return isSorted(arr, arr.length);
    }

    private static boolean isSorted(int[] arr, int end) {
        if (end <= 1) return true;
        return (arr[end - 2] < arr[end - 1]) && isSorted(arr, end - 1);
    }

    // shuffle an array
    private static void shuffle(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // swap elements
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

}
