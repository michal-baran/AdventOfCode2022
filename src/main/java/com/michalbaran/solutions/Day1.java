package com.michalbaran.solutions;

import com.michalbaran.utils.Elf;
import com.michalbaran.utils.StaticUtils;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Day1 {
    private static Logger logger = Logger.getLogger(Day1.class.getName());

    public static int Solution(String filename) {
        List<String> inputList = StaticUtils.inputFileToStringList(filename);
        List<Elf> elves = new ArrayList<>();
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

        int max = elves.stream()
                .mapToInt(Elf::getCalories)
                .max().orElseThrow(NoSuchElementException::new);

        logger.info("Max calories=" + max);
        return max;
    }
}
