package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = null;
        String fileNameTwo = null;
        String lineOne;
        String lineTwo;

        try {
            fileNameOne = reader.readLine();
            fileNameTwo = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader readerLineOne = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameOne)))) {
            while (!((lineOne = readerLineOne.readLine()) == null)) {
                allLines.add(lineOne);
            }
        } catch (IOException e) {
        }

        try (BufferedReader readerLineTwo = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameTwo)))) {
            while (!((lineTwo = readerLineTwo.readLine()) == null)) {
                forRemoveLines.add(lineTwo);
            }
        } catch (IOException e) {
        }
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }


    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();

        }
    }
}