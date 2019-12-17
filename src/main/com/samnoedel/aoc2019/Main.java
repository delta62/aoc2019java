package com.samnoedel.aoc2019;

import com.samnoedel.aoc2019.parsers.AocParser;
import com.samnoedel.aoc2019.parsers.Day3Parser;
import com.samnoedel.aoc2019.solvers.AocSolver;
import com.samnoedel.aoc2019.solvers.Day3Solver;

public class Main {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) throws Exception {
	    int day = Integer.parseInt(args[0]);
	    String inputPath = String.format("input/day%d.txt", day);
	    InputReader inputReader = new InputReader(inputPath);

	    AocParser parser;
	    AocSolver solver;

	    switch (day) {
            case 3:
                parser = new Day3Parser();
                solver = new Day3Solver();
                break;
            default:
                throw new Exception("No parser defined for day " + day);
        }

        String inputString = inputReader.read();

	    long parseStart = System.currentTimeMillis();
        Object input = parser.parse(inputString);
        long parseTime = System.currentTimeMillis() - parseStart;

        long part1Start = System.currentTimeMillis();
	    Object part1Answer = solver.solvePart1(input);
	    long part1Time = System.currentTimeMillis() - part1Start;

	    long part2Start = System.currentTimeMillis();
	    Object part2Answer = solver.solvePart2(input);
	    long part2Time = System.currentTimeMillis() - part2Start;

	    System.out.println(String.format("Parse time: %dms", parseTime));
	    System.out.println();

	    System.out.println("Part 1 answer: " + part1Answer.toString());
	    System.out.println(String.format("Part 1 time: %dms", part1Time));
        System.out.println();

	    System.out.println("Part 2 answer: " + part2Answer.toString());
        System.out.println(String.format("Part 2 time: %dms", part2Time));
    }
}
