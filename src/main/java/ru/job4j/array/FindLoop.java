package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int element1 = 4;
        int index1 = indexOf(numbers1, element1);
        System.out.println(index1);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int element = 5;
        int index = indexInRange(numbers, element, 1, 5);
        System.out.println(index);

    }
}
