package com.samnoedel.aoc2019.parsers;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class Day3ParserTest {
    @Test
    void Parse_TwoLines_ListOfTwo() throws ParseException {
        Day3Parser parser = new Day3Parser();
        int lines = parser.parse("U42\nD42\n").size();
        assertEquals(2, lines);
    }
}