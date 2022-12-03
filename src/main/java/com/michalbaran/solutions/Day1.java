package com.michalbaran.solutions;

import com.michalbaran.utils.Elf;
import com.michalbaran.utils.StaticUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Day1 {
    private static Logger logger = Logger.getLogger(Day1.class.getName());
    List<Elf> elves = new ArrayList<>();

    public Day1(String filename) {
        List<String> inputList = StaticUtils.inputFileToStringList(filename);
        Elf tempElf = new Elf();

        for (String line : inputList) {
            if (line.isBlank()) {
                elves.add(tempElf);
                tempElf = new Elf();
            } else {
                tempElf.addCalories(Integer.parseInt(line));
            }
        }
        elves.add(tempElf);
        Collections.sort(elves);
    }

    public int PartOne() {
        int max = elves.get(0).getCalories();
        logger.info("Max calories = " + max);
        return elves.get(0).getCalories();
    }

    public int PartTwo() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += elves.get(i).getCalories();
        }
        logger.info("Sum of calories = " + sum);
        return sum;
    }
}
