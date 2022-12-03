package com.michalbaran.solutions;

import com.michalbaran.utils.StaticUtils;

import java.util.List;
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
        return 0;
    }

    public static int getResult(String round) {
        int opponentsTurn = round.charAt(0) - 64;
        int response = round.charAt(2) - 87;
        int outcome = response;
        int roundResult = response - opponentsTurn;

        switch (roundResult) {
            case 0:
                outcome += 3;
                break;
            case 1:
            case -2:
                outcome += 6;
                break;
            default:
                break;
        }
        return outcome;
    }
}
