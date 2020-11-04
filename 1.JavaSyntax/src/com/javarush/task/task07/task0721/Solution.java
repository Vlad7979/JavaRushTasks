package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        int[] arrayList = getInts();

        int maximum = arrayList[0];
        int minimum = arrayList[0];


        for (int i = 0; i < 20; i++) {
            if (arrayList[i] > maximum) maximum = arrayList[i];
            if (arrayList[i] < minimum) minimum = arrayList[i];
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayList = new int[20];
        for (int i = 0; i < 20; i++) {
            arrayList[i] = Integer.parseInt(in.readLine());
        }
        return arrayList;
    }
}
