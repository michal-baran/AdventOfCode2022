package com.michalbaran.solutions;

import java.util.HashSet;
import java.util.Set;

public class Day3 extends Day {
    public Day3(String filename) {
        super(filename);
    }

    @Override
    public Integer PartOne() {
        int result = inputList.stream()
                .mapToInt(this::checkItems)
                .sum();
        logger.info("Part one result: " + result);
        return result;
    }

    @Override
    public Integer PartTwo() {
        int result = 0;

        for (int i = 0; i < inputList.size(); i += 3) {
            result += findStickerValue(i);
        }

        logger.info("Part one result: " + result);
        return result;
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

    private int findStickerValue(int index) {
        for (char c1 : inputList.get(index).toCharArray()) {
            for (char c2 : inputList.get(1 + index).toCharArray()) {
                if (c1 == c2) {
                    for (char c3 : inputList.get(2 + index).toCharArray()) {
                        if (c1 == c3) {
                            return this.getItemValue(c3);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
