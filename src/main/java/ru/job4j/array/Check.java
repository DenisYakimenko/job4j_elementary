package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean reference = data[0];
        for (int i = 0; i < data.length; i++) {
            boolean value = data[i];
            if (value != reference) {
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
