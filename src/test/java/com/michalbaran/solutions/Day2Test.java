package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {
    String example = "/src/test/resources/day2_example.txt";
    String input = "/src/main/resources/day2.txt";

    @Test
    public void testPartOne() {
        assertEquals(15, new Day2(example).PartOne());
        assertEquals(13565, new Day2(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals(12, new Day2(example).PartTwo());
        assertEquals(12424, new Day2(input).PartTwo());
    }
}