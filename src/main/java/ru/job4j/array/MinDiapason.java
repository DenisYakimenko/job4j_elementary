package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }

        public static void main(String[] args) {
            int[] array = {4, 3, 2, -5, 6, 7};
            int num = findMin(array, 1, 4);
            System.out.println(num);
        }
}
