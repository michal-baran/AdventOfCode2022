package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day5Test {
    String example = "/src/test/resources/day5_example.txt";
    String input = "/src/main/resources/day5.txt";

    @Test
    public void testPartOne() {
        String str1 = "CMZ";
        String str2 = new Day5(example).PartOne();
        assertEquals(str1, str2);
    }

    @Test
    public void testPartTwo() {
//        assertEquals(4, new Day5(example).PartTwo());
//        assertEquals(794, new Day5(input).PartTwo());
    }

    @Test
    void partOne() {
    }

    @Test
    void partTwo() {
    }
}