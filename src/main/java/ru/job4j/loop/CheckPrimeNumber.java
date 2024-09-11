package ru.job4j.loop;

public class CheckPrimeNumber {
    public static void main(String[] args) {

        System.out.println(check(5));
        System.out.println(check(4));
    }

    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

}



