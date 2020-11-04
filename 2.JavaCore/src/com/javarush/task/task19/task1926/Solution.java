package com.javarush.task.task19.task1926;

/*
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));

        fileName.close();

        while(reader.ready()){
            String[] string = reader.readLine().split("");
            for(int i = string.length - 1; i >= 0; i--) {
                System.out.print(string[i]);
            }
            System.out.println();
        }
        reader.close();
    }
}