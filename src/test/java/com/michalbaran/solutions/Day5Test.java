package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day5Test {
    String example = "/src/test/resources/day5_example.txt";
    String input = "/src/main/resources/day5.txt";

    @Test
    public void testPartOne() {
        assertEquals("CMZ", new Day5(example).PartOne());
        assertEquals("PTWLTDSJV", new Day5(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals("MCD", new Day5(example).PartTwo());
        assertEquals("WZMFVGGZP", new Day5(input).PartTwo());
    }
}