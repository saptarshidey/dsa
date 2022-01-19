package com.saptarshi.datastructure.sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = rnd.nextInt(100);
        }

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(numbers));

        InsertionSort.sort(numbers);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(numbers));
    }

    /*
     * Start with the first element of the array as a single element. So it is trivially sorted.
     * Then pick next elements one by one and insert them in the correct position keeping the
     * array sorted after each insertion.
     * Complexity: O(n^2)
     */
    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElm = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] >= currentElm) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentElm;
        }
    }

}
