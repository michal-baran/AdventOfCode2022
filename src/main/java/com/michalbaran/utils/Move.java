package com.michalbaran.utils;

import java.util.Arrays;

public class Move {
    private int[] parameters;

    public Move(String line) {
        parameters = Arrays.stream(line
                .replace(" ","")
                .replace("move","")
                .replace("from",",")
                .replace("to",",")
                .split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public int getMoveAmount() {
        return parameters[0];
    }

    public int getFrom() {
        return parameters[1];
    }

    public int getTo() {
        return parameters[2];
    }
}