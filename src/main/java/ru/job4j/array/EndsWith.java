package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length; i++) {
            if (word[word.length - postfix.length + i] != postfix[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        char[] prefix1 = {'l', 'o'};
        char[] prefix2 = {'l', 'a'};
        System.out.println("Test 1: " + endsWith(word, prefix1));
        System.out.println("Test 2: " + endsWith(word, prefix2));
    }
}
