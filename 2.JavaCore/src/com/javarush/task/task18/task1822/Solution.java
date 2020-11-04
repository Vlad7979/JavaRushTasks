package com.javarush.task.task18.task1822;

/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));
        fileName.close();
        String string;
        while((string = reader.readLine()) != null){
            if (string.startsWith(args[0] + " ")){
                System.out.println(string);
            }
        }
        reader.close();
    }
}