package com.samnoedel.aoc2019.cartesian;

public class Point {
    public final int x;
    public final int y;

    public Point(int fromX, int fromY) {
        this.x = fromX;
        this.y = fromY;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int manhattanDistance() {
        return x + y;
    }
}
