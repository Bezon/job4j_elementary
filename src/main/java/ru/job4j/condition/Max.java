package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return  left >= right ? left : right;
    }

    public static int max(int left, int right, int three) {
        right = max(three, right);
        return  left >= right ? left : right;
    }

    public static int max(int left, int right, int three, int four) {
        right = max(three, four, right);
        return  left >= right ? left : right;
    }

}
