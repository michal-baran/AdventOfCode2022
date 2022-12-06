package com.michalbaran.solutions;

import com.michalbaran.utils.Elf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 extends Day {
    List<Elf> elves = new ArrayList<>();

    public Day1(String filename) {
        super(filename);
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

    @Override
    public Integer PartOne() {
            int max = elves.get(0).getCalories();
        logger.info("Max calories = " + max);
        return elves.get(0).getCalories();
    }

    @Override
    public Integer PartTwo() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += elves.get(i).getCalories();
        }
        logger.info("Sum of calories = " + sum);
        return sum;
    }
}
