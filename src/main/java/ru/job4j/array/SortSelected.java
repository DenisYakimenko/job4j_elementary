package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1, 4, 5};
        int[] sortedArray = sort(array);
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            int num = sortedArray[i];
            System.out.print(num + " ");
        }
    }
}