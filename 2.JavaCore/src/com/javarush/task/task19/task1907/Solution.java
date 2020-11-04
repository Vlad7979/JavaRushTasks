package com.javarush.task.task19.task1907;

/*
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        String string;
        int count = 0;
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()))){
            while ((string = reader.readLine()) != null){
                count += (" " + string + " ").split("\\bworld\\b").length -1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);

    }
}