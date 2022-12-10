package com.michalbaran.auxiliary;

import java.util.Arrays;

public class Section {
    private int min;
    private int max;

    public Section(String line) {
        int[] bounds = Arrays.stream(line.split("-"))
                .mapToInt(Integer::parseInt)
                .toArray();

        min = bounds[0];
        max = bounds[1];
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


    public boolean checkFullOverlap(Section o) {
        return (min >= o.getMin() && max <= o.getMax()) ||
                (min <= o.getMin() && max >= o.getMax());
    }

    public int checkPartialOverlap(Section o) {
        for (int i = min; i <= max; i++) {
            for (int j = o.getMin(); j <= o.getMax(); j++) {
                if (i == j) return 1;
            }
        }
        return 0;
    }
}
