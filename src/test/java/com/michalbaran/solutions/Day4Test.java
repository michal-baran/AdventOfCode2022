package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day4Test {
    String example = "/src/test/resources/day4_example.txt";
    String input = "/src/main/resources/day4.txt";

    @Test
    public void testPartOne() {
        assertEquals(157, new Day3(example).PartOne());
        assertEquals(8072, new Day3(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals(70, new Day4(example).PartTwo());
        assertEquals(2567, new Day4(input).PartTwo());
    }
}