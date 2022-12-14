package com.michalbaran.auxiliary;

import java.util.ArrayList;
import java.util.List;

public class Elf implements Comparable<Elf> {
    private final List<Integer> caloriesList = new ArrayList<>();

    public void addCalories(int calories) {
        caloriesList.add(calories);
    }

    public int getCalories() {
        return caloriesList.stream().reduce(0, Integer::sum);
    }

    @Override
    public int compareTo(Elf other) {
        return Integer.compare(other.getCalories(), this.getCalories());
    }
}
