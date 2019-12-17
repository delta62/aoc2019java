package com.samnoedel.aoc2019.solvers;

import com.samnoedel.aoc2019.cartesian.Direction;
import com.samnoedel.aoc2019.cartesian.Point;
import com.samnoedel.aoc2019.cartesian.Span;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Day3Solver implements AocSolver<Integer, List<Direction[]>> {
    @Override
    public Integer solvePart1(List<Direction[]> input) {
        // Convert directions into array of spans for input1
        ArrayList<Span> wire1 = new ArrayList<>();
        Point currentPos = new Point(0, 0);
        for (Direction dir : input.get(0)) {
            Span next = new Span(currentPos, dir);
            currentPos = new Point(next.getTo());
            wire1.add(next);
        }

        // Convert directions into array of spans for input2
        // Walk through input 2 segments and find all intersections with path 1
        ArrayList<Integer> intersections = new ArrayList<>();
        currentPos = new Point(0, 0);
        for (Direction dir : input.get(1)) {
            Point from = new Point(currentPos);
            Span span = new Span(from, dir);

            for (Span wire1Span : wire1) {
                Point intersection = wire1Span.findIntersectionWith(span);
                if (intersection != null) {
                    intersections.add(intersection.manhattanDistance());
                }
            }
        }

        // Find smallest intersecting point
        return intersections
                .stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
    }

    @Override
    public Integer solvePart2(List<Direction[]> input) {
        return 0;
    }
}
