package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        if (left[left.length - 1] != right[right.length - 1]) {
            result = false;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        System.out.println(check(left, right));

    }
}
