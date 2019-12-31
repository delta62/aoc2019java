package com.samnoedel.aoc2019.solvers;

import com.samnoedel.aoc2019.cartesian.Vector;
import com.samnoedel.aoc2019.cartesian.Point;
import com.samnoedel.aoc2019.cartesian.Span;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Day3Solver implements AocSolver<Integer, List<Vector[]>> {
    @Override
    public Integer solvePart1(List<Vector[]> input) {
        // Convert directions into array of spans for input1
        ArrayList<Span> wire1 = new ArrayList<>();
        Point currentPos = new Point(0, 0);
        for (Vector dir : input.get(0)) {
            Span next = new Span(currentPos, dir);
            currentPos = new Point(next.getTo());
            wire1.add(next);
        }

        // Convert directions into array of spans for input2
        // Walk through input 2 segments and find all intersections with path 1
        ArrayList<Integer> intersections = new ArrayList<>();
        currentPos = new Point(0, 0);
        for (Vector dir : input.get(1)) {
            Point from = new Point(currentPos);
            Span span = new Span(from, dir);

            for (Span wire1Span : wire1) {
                Optional<Point> intersection = wire1Span.findIntersectionWith(span);
                intersection.ifPresent(point -> intersections.add(point.manhattanDistance()));
            }
        }

        // Find smallest intersecting point
        return intersections
                .stream()
                .filter(x -> x != 0)
                .min(Comparator.naturalOrder())
                .orElse(0);
    }

    @Override
    public Integer solvePart2(List<Vector[]> input) {
        return 0;
    }
}
