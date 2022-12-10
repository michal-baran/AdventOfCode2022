package com.michalbaran.solutions;

import com.michalbaran.auxiliary.Move;

import java.util.*;

public class Day5 extends Day {
    private final List<Deque<Character>> stacks = new ArrayList<>();
    private final List<Move> moves = new ArrayList<>();

    public Day5(String filename) {
        super(filename);
        InitializeStacks();
        inputList.forEach(this::processLines);
    }

    @Override
    public String PartOne() {
        moves.forEach(this::performMove9000);
        String result = getResult();
        logger.info("Result of Part One: " + result);
        return result;
    }

    @Override
    public String PartTwo() {
        moves.forEach(this::performMove9001);
        String result = getResult();
        logger.info("Result of Part Two: " + result);
        return result;
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

    private void performMove9000(Move move) {
        Deque<Character> stackFrom = stacks.get(move.getFrom() - 1);
        Deque<Character> stackTo = stacks.get(move.getTo() - 1);

        for (int i = 0; i < move.getMoveAmount(); i++) {
            stackTo.add(Objects.requireNonNull(stackFrom.pollLast()));
        }
    }

    private void performMove9001(Move move) {
        Deque<Character> stackFrom = stacks.get(move.getFrom() - 1);
        Deque<Character> stackTo = stacks.get(move.getTo() - 1);
        Deque<Character> tempDeq = new ArrayDeque<>();

        for (int i = 0; i < move.getMoveAmount(); i++) {
            tempDeq.push(Objects.requireNonNull(stackFrom.pollLast()));
        }

        stackTo.addAll(tempDeq);
    }

    private String getResult() {
        StringBuilder sb = new StringBuilder();
        stacks.forEach(s -> sb.append(s.peekLast()));
        return sb.toString();
    }
}