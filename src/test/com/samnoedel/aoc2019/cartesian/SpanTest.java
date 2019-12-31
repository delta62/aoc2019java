package com.samnoedel.aoc2019.cartesian;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SpanTest {

    @Test
    void FindIntersectionWith_NonIntersecting_ReturnsNone() {
        Span x = new Span(new Point(0, 0), new Point(10, 0));
        Span y = new Span(new Point(0, 10), new Point(0, 20));
        Optional<Point> intersection = x.findIntersectionWith(y);
        assertEquals(Optional.empty(), intersection);
    }

    @Test
    void FindIntersectionWith_CornerIntersection_ReturnsPoint() {
        Span x = new Span(new Point(0, 0), new Point(10, 0));
        Span y = new Span(new Point(0, 0), new Point(0, 10));
        Optional<Point> intersection = x.findIntersectionWith(y);
        assertEquals(Optional.of(new Point(0, 0)), intersection);
    }

    @Test
    void FindIntersectionWith_MiddleIntersection_ReturnsPoint() {
        Span x = new Span(new Point(-5, 0), new Point(5, 0));
        Span y = new Span(new Point(0, -5), new Point(0, 5));
        Optional<Point> intersection = x.findIntersectionWith(y);
        assertEquals(Optional.of(new Point(0, 0)), intersection);
    }
}