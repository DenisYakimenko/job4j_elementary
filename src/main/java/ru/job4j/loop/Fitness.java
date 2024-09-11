package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }

        return month;
    }

    public static void main(String[] args) {
        int ivanStrength = 90;
        int nikStrength = 120;
        int months = calc(ivanStrength, nikStrength);
        System.out.println("Ивану потребуется " + months + " месяцев, чтобы превзойти Николая по силе тяги.");
    }
}
