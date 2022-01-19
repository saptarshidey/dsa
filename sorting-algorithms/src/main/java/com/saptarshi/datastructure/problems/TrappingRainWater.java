package com.saptarshi.datastructure.problems;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] terrain = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total capacity = " + getWaterCapacity(terrain));
    }

    private static int getWaterCapacity(int[] arr) {
        int totCapacity = 0;

        for (int i = 1; i < arr.length - 1 ; i++) {
            // find the highest wall at left
            int leftHighest = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                leftHighest = Math.max(arr[j], leftHighest);
            }

            // find the highest wall at right
            int rightHighest = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightHighest = Math.max(arr[j], rightHighest);
            }

            int capacity = Math.min(leftHighest, rightHighest) - arr[i];
            totCapacity += capacity;
        }

        return totCapacity;
    }

}
