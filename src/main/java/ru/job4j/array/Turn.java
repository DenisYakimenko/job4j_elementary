package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] result = back(array);
        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index]);
        }
    }
}