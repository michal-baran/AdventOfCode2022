package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day4Test {
    String example = "/src/test/resources/day4_example.txt";
    String input = "/src/main/resources/day4.txt";

    @Test
    public void testPartOne() {
        assertEquals(2, new Day4(example).PartOne());
        assertEquals(448, new Day4(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals(4, new Day4(example).PartTwo());
        assertEquals(794, new Day4(input).PartTwo());
    }
}