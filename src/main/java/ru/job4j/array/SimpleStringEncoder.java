package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = input.substring(0, 1);
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                if (counter > 1) {
                    result = result + counter;
                }
                symbol = input.charAt(i);
                result = result + symbol;
                counter = 1;
            }
        }
        if (counter > 1) {
            result = result + counter;
        }
        return result;
    }
}
