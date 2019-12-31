package com.samnoedel.aoc2019.solvers;

import com.samnoedel.aoc2019.cartesian.Vector;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day3SolverTest {

    @Test
    void SolvePart1_NoInput_ReturnsZero() {
        List<Vector[]> input = new ArrayList<>();
        Day3Solver solver = new Day3Solver();
        assertEquals(0, solver.solvePart1(input));
    }

    @Test
    void SolvePart1_NonIntersecting_ReturnsZero() {
        List<Vector[]> input = new ArrayList<>();
        Day3Solver solver = new Day3Solver();
        assertEquals(0, solver.solvePart1(input));
    }
}