package com.michalbaran.solutions;

import com.michalbaran.utils.Move;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Day5 extends Day {
    private List<ArrayDeque<Character>> stacks = new ArrayList<>();
    private List<Move> moves = new ArrayList<>();

    public Day5(String filename) {
        super(filename);
    }

    @Override
    public String PartOne() {
        InitializeStacks();
        inputList.forEach(this::processLines);
        moves.forEach(this::performMove);

        String result = getResult();
        logger.info("Result of Part One: " + result);
        return result;
    }

    @Override
    public String PartTwo() {
        return null;
    }

    private void InitializeStacks() {
        int stacksCount = (inputList.get(0).length() + 1) / 4;
        for (int i = 0; i < stacksCount; i++) {
            stacks.add(new ArrayDeque<>());
        }
    }


    private void processLines(String line) {
        if (line.length() > 0) {
            if (line.contains("[")) {
                int j = 0;
                for (int i = 1; i < line.length(); i += 4) {

                    Character letter = line.charAt(i);
                    if (!letter.equals(' ')) {
                        stacks.get(j).push(letter);
                    }
                    j++;
                }
            }
            if (line.charAt(0) == 'm') {
                moves.add(new Move(line));
            }
        }
    }

    private void performMove(Move move) {
        ArrayDeque<Character> stackFrom = stacks.get(move.getFrom() - 1);
        ArrayDeque<Character> stackTo = stacks.get(move.getTo() - 1);

        for (int i = 0; i < move.getMoveAmount(); i++) {
            stackTo.add(Objects.requireNonNull(stackFrom.pollLast()));
        }
    }

    private String getResult() {
        StringBuilder sb = new StringBuilder();
        stacks.forEach(s -> sb.append(s.peekLast()));
        return sb.toString();
    }
}