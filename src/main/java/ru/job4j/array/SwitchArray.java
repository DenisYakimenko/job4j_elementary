package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        int[] array = {1, 2, 3, 4, 5};
        swap(array, 2, 3);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }

        System.out.println("Массив после замены: ");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            System.out.print(value + " ");
        }

    }

}
