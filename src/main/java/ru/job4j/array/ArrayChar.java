package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        if (prefix.length > word.length) {
            return false;
        }
        for (int i = 0; i < prefix.length; i++) {
            if (word[i] != prefix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] prefix1 = {'h', 'e'};
        char[] prefix2 = {'h', 'i'};
        System.out.println("Test 1: " + startsWith(word, prefix1));
        System.out.println("Test 2: " + startsWith(word, prefix2));
    }
}
