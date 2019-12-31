package com.samnoedel.aoc2019.cartesian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void ManhattanDistance_PositiveDirections_PositiveOutput() {
        Point p = new Point(5, 10);
        assertEquals(15, p.manhattanDistance());
    }

    @Test
    void ManhattanDistance_NegativeDirections_PositiveOutput() {
        Point p = new Point(-5, -10);
        assertEquals(15, p.manhattanDistance());
    }

    @Test
    void ManhattanDistance_ZeroDirections_ZeroOutput() {
        Point p = new Point(0, 0);
        assertEquals(0, p.manhattanDistance());
    }
}