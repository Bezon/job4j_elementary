package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to10then1() {
        double expected = 1;
        Point a = new Point(2, 0);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to11then4() {
        double expected = 4;
        Point a = new Point(1, 5);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to41then4() {
        double expected = 4;
        Point a = new Point(0, 1);
        Point b = new Point(4, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}