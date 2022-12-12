package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day8Test {
    String example = "/src/test/resources/day8_example.txt";
    String input = "/src/main/resources/day8.txt";

    @Test
    public void testPartOne() {
        assertEquals(21, new Day8(example).PartOne());
        assertEquals(1835, new Day8(input).PartOne());
    }

    @Test
    public void testPartTwo() {
//        assertEquals(24933642, new Day8(example).PartTwo());
//        assertEquals(2195372, new Day8(input).PartTwo());

    }
}