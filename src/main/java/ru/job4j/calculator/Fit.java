package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {

        return (height - 100) * 1.15;
    }

    public static double womanWeight(short heightW) {

        return (heightW - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        short heightW = 170;
        double woman = Fit.womanWeight(heightW);

        System.out.println("Man 187 cm is " + man + " kg");
        System.out.println("Woman 165 cm is " + woman + " kg");
    }
}
