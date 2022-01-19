package com.saptarshi.datastructure.sorting;

import java.util.Random;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = rnd.nextInt(100);
        }

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(numbers));

        BubbleSort.sort(numbers);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(numbers));
    }

    private static void sort(int[] arr) {
        boolean swapped = true;

        for (int pass = 0; pass < arr.length - 1 && swapped; pass++) {
            swapped = false;
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap elements
                    swapped = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

}
