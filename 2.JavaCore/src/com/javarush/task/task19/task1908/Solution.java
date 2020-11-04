package com.javarush.task.task19.task1908;

/*
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName.readLine()));
        fileName.close();
        String string;
        String result = "";
        while ((string = reader.readLine()) != null){
            String [] words = string.split(" ");
            for (String word : words ){
                if (word.matches("\\d+")){
                    result += word + " ";
                }
            }
        }
        reader.close();
        writer.write(result);
        writer.close();
    }
}