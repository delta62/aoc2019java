package com.samnoedel.aoc2019.cartesian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void ManhattanDistance() {
        Point p = new Point(5, 10);
        assertEquals(15, p.manhattanDistance());
    }
}