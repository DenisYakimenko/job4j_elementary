package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = getIndexes(array, target);

        System.out.println(Arrays.toString(result));
    }
}
