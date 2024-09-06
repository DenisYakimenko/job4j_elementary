package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        // Assuming the conversion rate is 1 Euro = 70 Rubles
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        // Assuming the conversion rate is 1 Dollar = 60 Rubles
        return value / 60;
    }

    public static void main(String[] args) {

       float euro = rubleToEuro(140);

        System.out.println("140 rubles are " + euro + " euro.");

        double dollar = rubleToDollar(180);

        System.out.println("180 rubles are "+dollar+" dollar.");
    }
}
