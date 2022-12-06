package com.michalbaran.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day6 extends Day {
    public Day6(String filename) {
        super(filename);
    }

    @Override
    public Integer PartOne() {
        String line = inputList.get(0);
        for (int i = 4; i < line.length(); i++) {
            String word = line.substring((i - 4), i);

            Character[] charArray = word.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
            Set<Character> s = new HashSet<>(Arrays.asList(charArray));

            if (s.size() == word.length()) {
                logger.info("Result: " + i);
                return i;
            }
        }
        return 0;
    }

    @Override
    public Integer PartTwo() {
        return null;
    }
}
