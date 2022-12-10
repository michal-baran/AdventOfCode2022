package com.michalbaran.solutions;

import com.michalbaran.auxiliary.Section;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day4 extends Day {

    public Day4(String filename) {
        super(filename);
    }

    @Override
    public Integer PartOne() {
        int result = inputList.stream()
                .mapToInt(this::checkPairOverlapping)
                .sum();
        logger.info("Result = " + result);
        return result;
    }

    @Override
    public Integer PartTwo() {
        int result = inputList.stream()
                .mapToInt(this::getAllOverlappingSections)
                .sum();
        logger.info("Result = " + result);
        return result;
    }

    private int checkPairOverlapping(String line) {
        List<Section> sections = Arrays.stream(line.split(","))
                .map(Section::new)
                .collect(Collectors.toList());

        return sections.get(0).checkFullOverlap(sections.get(1)) ? 1 : 0;
    }

    private int getAllOverlappingSections(String line) {

        List<Section> sections = Arrays.stream(line.split(","))
                .map(Section::new)
                .collect(Collectors.toList());

        return sections.get(0).checkPartialOverlap(sections.get(1));
    }


}
