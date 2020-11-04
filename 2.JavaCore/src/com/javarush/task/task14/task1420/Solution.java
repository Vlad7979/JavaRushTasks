package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numberStr = reader.readLine();
        int numberOne = Integer.valueOf(numberStr);
        if (numberOne <= 0) {
            throw new IllegalArgumentException("Only positive number");
        }
        numberStr = reader.readLine();
        int numberTwo = Integer.valueOf(numberStr);
        if (numberTwo <= 0) {
            throw new IllegalArgumentException("Only positive number");
        }
        LargestCommonFactor(numberOne, numberTwo);

    }

    public static void LargestCommonFactor(int numberOne, int numberTwo) {
        int maxDivider = 1;
        for (int i = 2; i <= (numberOne > numberTwo ? numberTwo : numberOne); i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                maxDivider = i;
            }
        }
        System.out.println(maxDivider);
    }
}