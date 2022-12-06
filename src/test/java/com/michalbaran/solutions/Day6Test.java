package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day6Test {
    String example = "/src/test/resources/day6_example.txt";
    String input = "/src/main/resources/day6.txt";

    @Test
    public void testPartOne() {
        assertEquals(7, new Day6(example).PartOne());
        assertEquals(1855, new Day6(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        /*
        assertEquals("MCD", new Day6(example).PartTwo());
        assertEquals("WZMFVGGZP", new Day6(input).PartTwo());
        */
    }
}