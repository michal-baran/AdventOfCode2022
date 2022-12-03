package com.michalbaran.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaticUtils {
    static String filepath = System.getProperty("user.dir");

    public static List<String> inputFileToStringList(String fileName) {
        List<String> resultList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(StaticUtils.filepath + fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public static List<Integer> inputFileToList(String fileName) {
        List<Integer> resultList = new ArrayList<>();

        try (Scanner sc = new Scanner(StaticUtils.filepath + fileName)) {
            while (sc.hasNextLine()) {
                resultList.add(sc.nextInt());
            }
        }
        return resultList;
    }
}


