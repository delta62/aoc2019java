package com.samnoedel.aoc2019.cartesian;

public class Direction {
    private final CardinalDirection dir;
    private final int len;

    public Direction(CardinalDirection dir, int len) {
        this.dir = dir;
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public CardinalDirection getDir() {
        return dir;
    }
}
