package com.michalbaran.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @Test
    public void testPartOne(){
        assertEquals(24000, Day1.Solution("/src/test/resources/day1a_example.txt"));
        assertEquals(71023, Day1.Solution("/src/main/resources/day1a.txt"));
    }

    @Test
    public void testPartTwo(){

    }


}