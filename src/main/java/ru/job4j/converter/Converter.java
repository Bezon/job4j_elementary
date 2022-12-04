package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);

        float expected = 2;
        boolean passed = expected == euro;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        expected = 3;
        passed = expected == dollar;
        System.out.println("180 rubles are 3 dollar. Test result : " + passed);
    }
}
