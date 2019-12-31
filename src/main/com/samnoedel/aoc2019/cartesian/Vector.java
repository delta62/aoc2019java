package com.samnoedel.aoc2019.cartesian;

public class Vector {
    private final Direction dir;
    private final int len;

    public Vector(Direction dir, int len) {
        this.dir = dir;
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public Direction getDir() {
        return dir;
    }
}
