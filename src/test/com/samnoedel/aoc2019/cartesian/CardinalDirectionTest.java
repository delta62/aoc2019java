package com.samnoedel.aoc2019.cartesian;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class CardinalDirectionTest {

    @Test
    void Parse_U_Up() throws ParseException {
        assertEquals(CardinalDirection.parse('U'), CardinalDirection.Up);
    }

    @Test
    void Parse_D_Down() throws ParseException {
        assertEquals(CardinalDirection.parse('D'), CardinalDirection.Down);
    }

    @Test
    void Parse_L_Left() throws ParseException {
        assertEquals(CardinalDirection.parse('L'), CardinalDirection.Left);
    }

    @Test
    void Parse_R_Right() throws ParseException {
        assertEquals(CardinalDirection.parse('R'), CardinalDirection.Right);
    }

    @Test
    void Parse_X_ParseException() {
        assertThrows(ParseException.class, () -> CardinalDirection.parse('x'));
    }
}