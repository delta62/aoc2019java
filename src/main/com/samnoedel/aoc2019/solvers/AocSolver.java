package com.samnoedel.aoc2019.solvers;

public interface AocSolver<T, I> {
    T solvePart1(I input);
    T solvePart2(I input);
}
