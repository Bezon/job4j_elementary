package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] arr = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                arr[i - 1][j - 1] = j * i;
            }
        }
        return arr;
    }
}
