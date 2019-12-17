package com.samnoedel.aoc2019.cartesian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpanTest {

    @Test
    void getFrom() {
        int fromX = 42;
        int fromY = 52;
        Point from = new Point(fromX, fromY);
        Point to = new Point(0, 0);
        Span span = new Span(from, to);
        assertEquals(span.getFrom().x, fromX);
        assertEquals(span.getFrom().y, fromY);
    }

    @Test
    void getTo() {
        int toX = 42;
        int toY = 52;
        Point from = new Point(0, 0);
        Point to = new Point(toX, toY);
        Span span = new Span(from, to);
        assertEquals(span.getTo().x, toX);
        assertEquals(span.getTo().y, toY);
    }
}