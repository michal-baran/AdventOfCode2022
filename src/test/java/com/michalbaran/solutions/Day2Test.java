package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {
    static String example = "/src/test/resources/day2_example.txt";
    static String input = "/src/main/resources/day2.txt";

    @Test
    public void testPartOne() {
        assertEquals(15, new Day2(example).PartOne());
        assertEquals(13565, new Day2(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals(12, new Day2(example).PartTwo());
        //assertEquals(206289, new Day2(input).PartTwo());
    }
}