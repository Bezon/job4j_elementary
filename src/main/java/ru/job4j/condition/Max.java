package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return  left >= right ? left : right;
    }

    public static int max(int left, int right, int three) {
        return max(left, max(three, right));
    }

    public static int max(int left, int right, int three, int four) {
        return max(left, max(three, four, right));
    }

}
