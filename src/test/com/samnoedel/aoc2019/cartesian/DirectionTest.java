package com.samnoedel.aoc2019.cartesian;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void Parse_U_Up() throws ParseException {
        assertEquals(Direction.parse('U'), Direction.Up);
    }

    @Test
    void Parse_D_Down() throws ParseException {
        assertEquals(Direction.parse('D'), Direction.Down);
    }

    @Test
    void Parse_L_Left() throws ParseException {
        assertEquals(Direction.parse('L'), Direction.Left);
    }

    @Test
    void Parse_R_Right() throws ParseException {
        assertEquals(Direction.parse('R'), Direction.Right);
    }

    @Test
    void Parse_X_ParseException() {
        assertThrows(ParseException.class, () -> Direction.parse('x'));
    }
}