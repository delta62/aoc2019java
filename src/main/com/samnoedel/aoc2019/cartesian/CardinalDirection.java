package com.samnoedel.aoc2019.cartesian;

import java.text.ParseException;

public enum CardinalDirection {
    Up,
    Down,
    Left,
    Right;

    public static CardinalDirection parse(char c) throws ParseException {
        switch (c) {
            case 'U': return CardinalDirection.Up;
            case 'D': return CardinalDirection.Down;
            case 'L': return CardinalDirection.Left;
            case 'R': return CardinalDirection.Right;
        }
        throw new ParseException("" + c, 0);
    }
}
