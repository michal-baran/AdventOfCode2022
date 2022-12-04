package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {
    String example = "/src/test/resources/day1_example.txt";
    String input = "/src/main/resources/day1.txt";

    @Test
    public void testPartOne() {
        assertEquals(24000, new Day1(example).PartOne());
        assertEquals(71023, new Day1(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals(45000, new Day1(example).PartTwo());
        assertEquals(206289, new Day1(input).PartTwo());
    }
}