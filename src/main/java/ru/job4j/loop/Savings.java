package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total += total * (percent / 100);
            total += annualDeposit;
            years++;
            System.out.println(total);
        } while (total < goal);
        return years;
    }

    public static void main(String[] args) {

        int years = years(1000, 100, 20);
        System.out.println("Количество лет для накопления суммы: " + years);
    }
}
