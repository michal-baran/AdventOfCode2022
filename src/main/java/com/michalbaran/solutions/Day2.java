package com.michalbaran.solutions;

import java.util.Map;

public class Day2 extends Day {

    public Day2(String filename) {
        super(filename);
    }

    @Override
    public int PartOne() {
        int result = inputList.stream()
                .mapToInt(this::getResult)
                .sum();
        logger.info("Strategy result: " + result);
        return result;
    }

    @Override
    public int PartTwo() {
        int result = inputList.stream()
                .mapToInt(this::changeResponse)
                .sum();
        logger.info("Strategy result: " + result);
        return result;
    }

    public int getResult(String round) {
        Map<String, Integer> scoreMap = Map.of(
                "A X", 4,
                "A Y", 8,
                "A Z", 3,

                "B X", 1,
                "B Y", 5,
                "B Z", 9,

                "C X", 7,
                "C Y", 2,
                "C Z", 6);
        return scoreMap.get(round);
    }

    private int changeResponse(String round) {
        Map<String, Integer> scoreMap = Map.of(
                "A X", 3,
                "A Y", 4,
                "A Z", 8,

                "B X", 1,
                "B Y", 5,
                "B Z", 9,

                "C X", 2,
                "C Y", 6,
                "C Z", 7);
        return scoreMap.get(round);

    }
}
