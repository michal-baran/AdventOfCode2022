package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day7Test {
    String example = "/src/test/resources/day7_example.txt";
    String input = "/src/main/resources/day7.txt";

    @Test
    public void testPartOne() {
        assertEquals(95437, new Day7(example).PartOne());
        assertEquals(1770595, new Day7(input).PartOne());
    }

    @Test
    public void testPartTwo() {
        assertEquals(24933642, new Day7(example).PartTwo());
        assertEquals(2195372, new Day7(input).PartTwo());

    }
}