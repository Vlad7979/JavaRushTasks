package com.javarush.task.task18.task1802;

/*
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());
        int min = file.read();
        while (file.available() > 0){
            int minByte = file.read();
            if(minByte < min) min = minByte;
        }
        file.close();
        System.out.println(min);
    }
}