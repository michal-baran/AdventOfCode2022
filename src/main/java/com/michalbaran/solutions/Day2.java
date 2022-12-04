package com.michalbaran.solutions;

import com.michalbaran.utils.StaticUtils;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Day2 {
    private static final Logger logger = Logger.getLogger(Day1.class.getName());
    List<String> inputList;

    public Day2(String filename) {
        inputList = StaticUtils.inputFileToStringList(filename);
    }

    public int PartOne() {
        int result = inputList.stream()
                .mapToInt(Day2::getResult)
                .sum();
        logger.info("Strategy result: " + result);
        return result;
    }

    public int PartTwo() {
        int result = inputList.stream()
                .mapToInt(Day2::changeResponse)
                .sum();
        logger.info("Strategy result: " + result);
        return result;
    }

    public static int getResult(String round) {
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

    private static int changeResponse(String round) {
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
