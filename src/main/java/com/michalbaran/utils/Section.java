package com.michalbaran.utils;

import java.util.Arrays;

public class Section {
    int[] bounds;

    public Section(String line) {
        bounds = Arrays.stream(line.split("-"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public int getMin() {
        return bounds[0];
    }

    public int getMax() {
        return bounds[1];
    }


    public boolean checkOverlap(Section o) {
        return (this.getMin() >= o.getMin() && this.getMax() <= o.getMax()) ||
                (this.getMin() <= o.getMin() && this.getMax() >= o.getMax());
    }
}
