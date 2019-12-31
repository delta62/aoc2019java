package com.samnoedel.aoc2019.cartesian;

import java.text.ParseException;

public enum Direction {
    Up,
    Down,
    Left,
    Right;

    public static Direction parse(char c) throws ParseException {
        switch (c) {
            case 'U': return Direction.Up;
            case 'D': return Direction.Down;
            case 'L': return Direction.Left;
            case 'R': return Direction.Right;
        }
        throw new ParseException("" + c, 0);
    }
}
