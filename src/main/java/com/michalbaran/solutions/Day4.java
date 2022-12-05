package com.michalbaran.solutions;

import com.michalbaran.utils.Section;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day4 extends Day {

    public Day4(String filename) {
        super(filename);
    }

    @Override
    public int PartOne() {
        int result = inputList.stream()
                .mapToInt(this::checkPair)
                .sum();
        logger.info("Result = " + result);
        return result;
    }

    @Override
    public int PartTwo() {
        return 0;
    }

    private int checkPair(String line) {
        List<Section> sections = Arrays.stream(line.split(","))
                .map(Section::new)
                .collect(Collectors.toList());

        return sections.get(0).checkOverlap(sections.get(1)) ? 1 : 0;
    }


}