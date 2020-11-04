package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (fileInputStream.available() > 0){
            int byteMax = fileInputStream.read();
            if (byteMax > max) max = byteMax;
        }
        fileInputStream.close();
        System.out.println(max);

    }
}