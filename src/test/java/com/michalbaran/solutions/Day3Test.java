package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day3Test {
    static String example = "/src/test/resources/day3_example.txt";
    static String input = "/src/main/resources/day3.txt";

    @Test
    public void testPartOne() {
        assertEquals(157, new Day3(example).PartOne());
        //assertEquals(71023, new Day3(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        //assertEquals(45000, new Day3(example).PartTwo());
        //assertEquals(206289, new Day3(input).PartTwo());
    }
}