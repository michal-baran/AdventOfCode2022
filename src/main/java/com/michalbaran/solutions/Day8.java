package com.michalbaran.solutions;

import java.util.ArrayList;
import java.util.List;

public class Day8 extends Day {
    List<List<Integer>> trees = new ArrayList<>();

    public Day8(String filename) {
        super(filename);
        inputList.forEach(this::processLine);
    }

    @Override
    public Integer PartOne() {
        int visibleTrees = ((trees.get(0).size() - 1) + (trees.size() - 1)) * 2;
        for (int y = 1; y < trees.size() - 1; y++) {
            for (int x = 1; x < trees.get(0).size() - 1; x++) {
                visibleTrees += checkTree(x, y);
            }
        }
        logger.info("Result " + visibleTrees);
        return visibleTrees;
    }

    @Override
    public <T> T PartTwo() {
        return null;
    }

    private void processLine(String line) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            row.add(Integer.parseInt(line.substring(i, i + 1)));
        }
        System.out.println(row);
        trees.add(row);
    }

    public int checkTree(int x, int y) {
        int treeHeight = trees.get(y).get(x);
        int checkedheight = 0;
        int max = 0;

        //checking visibility from left
        for (int i = 0; i < x; i++) {
            max = Math.max(trees.get(y).get(i), max);
        }
        if (max < treeHeight) {
            return 1;
        }
        max = 0;

        //checking visibility from right
        for (int i = x + 1; i < trees.get(y).size(); i++) {
            max = Math.max(trees.get(y).get(i), max);
        }
        if (max < treeHeight) {
            return 1;
        }
        max = 0;

        //checking visibility from top
        for (int i = 0; i < y; i++) {
            max = Math.max(trees.get(i).get(x), max);
        }
        if (max < treeHeight) {
            return 1;
        }
        max = 0;

        //checking visibility from bottom
        for (int i = y+1; i < trees.size(); i++) {
            max = Math.max(trees.get(i).get(x), max);
        }
        if (max < treeHeight) {
            return 1;

        }
        return 0;
    }
}