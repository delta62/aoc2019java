package com.samnoedel.aoc2019.parsers;

import java.text.ParseException;

public interface AocParser<T> {
    T parse(String data) throws ParseException;
}
