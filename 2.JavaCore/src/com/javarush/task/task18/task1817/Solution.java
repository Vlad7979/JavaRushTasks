package com.javarush.task.task18.task1817;

/*
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = fileInputStream.available();
        int countOfSpace = 0;
        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 32) countOfSpace++;
        }
        fileInputStream.close();
        double result = ((double) countOfSpace / count) * 100;
        System.out.printf("%.2f", result);
    }
}