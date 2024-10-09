package ru.job4j.loop;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(check(5));
        System.out.println(check(4));
    }

    public static boolean check(int number) {
        boolean isPrime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}


