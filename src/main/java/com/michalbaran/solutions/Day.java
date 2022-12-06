package com.michalbaran.solutions;

import com.michalbaran.utils.StaticUtils;

import java.util.List;
import java.util.logging.Logger;

public abstract class Day {
    Logger logger = Logger.getLogger(Day.class.getName());
    List<String> inputList;

    public Day(String filename) {
        inputList = StaticUtils.inputFileToStringList(filename);
    }

    public abstract <T> T PartOne();

    public abstract <T> T PartTwo();
}
