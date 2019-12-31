package com.samnoedel.aoc2019.parsers;

import com.samnoedel.aoc2019.cartesian.Direction;
import com.samnoedel.aoc2019.cartesian.Vector;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

public class Day3Parser implements AocParser<List<Vector[]>> {
    public List<Vector[]> parse(String data) throws ParseException {
        return data.lines()
                .map(line -> line.split(","))
                .map(dirStrings -> {
                    Vector[] dirs = new Vector[dirStrings.length];
                    for (int i = 0; i < dirStrings.length; i++) {
                        String raw = dirStrings[i];
                        char dir = raw.charAt(0);
                        String lenStr = raw.substring(1);
                        int len = Integer.parseInt(lenStr);

                        try {
                            dirs[i] = new Vector(Direction.parse(dir), len);
                        } catch (ParseException e) {
                            throw new RuntimeException("Unable to parse integer");
                        }
                    }
                    return dirs;
                })
                .collect(Collectors.toList());
    }
}
