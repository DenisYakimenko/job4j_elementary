package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] test1 = {true, true, true};
        boolean[] test2 = {true, false, true};
        boolean[] test3 = {false, false, false};

        System.out.println("Test 1: " + mono(test1));
        System.out.println("Test 2: " + mono(test2));
        System.out.println("Test 3: " + mono(test3));
    }
}
