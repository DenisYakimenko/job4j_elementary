package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int finish = 11;
        int result = calc(finish);
        System.out.println("Количество простых чисел: " + result);

    }

}
