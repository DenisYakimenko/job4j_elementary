package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }


    public static double sumOfDifferenceAndDivision(double first, double second) {

        return difference(first, second) + division(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {

        return sum(first, second) + difference(first, second) + division(first, second) + multiply(first, second);

    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 2));
        System.out.println("Результат расчета sumOfDifferenceAndDivision: " + sumOfDifferenceAndDivision(12, 5));
        System.out.println("Результат расчета sumOfAllOperations: " + sumOfAllOperations(8, 4));
    }


}
