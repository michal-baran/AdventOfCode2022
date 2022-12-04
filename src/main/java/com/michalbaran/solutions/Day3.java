package com.michalbaran.solutions;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day3 extends Day {
    List<Value> commonLetters = new ArrayList<>();

    public Day3(String filename) {
        super(filename);
    }

    @Override
    public int PartOne() {
        int result = inputList.stream()
                .mapToInt(this::checkItems)
                .sum();
        logger.info("Part one result: " + result);
        return result;
    }

    @Override
    public int PartTwo() {
        return 0;
    }

    private int getItemValue(char c) {
        int value = c;
        value -= c > 90 ? 96 : 38;

        return value;
    }

    private int checkItems(String backpack) {
        Set<Character> commonItems = new HashSet<>();
        int mid = backpack.length() / 2;

        String[] container = {backpack.substring(0, mid), backpack.substring(mid)};
        for (char c1 : container[0].toCharArray()) {
            for (char c2 : container[1].toCharArray()) {
                if (c1 == c2) {
                    commonItems.add(c1);
                }
            }
        }
        return commonItems.stream()
                .mapToInt(this::getItemValue)
                .sum();
    }
}
