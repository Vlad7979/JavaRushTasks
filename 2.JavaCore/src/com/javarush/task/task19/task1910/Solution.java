package com.javarush.task.task19.task1910;

/*
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName.readLine()));
        fileName.close();
        String string;
        while ((string = reader.readLine()) != null){
            string =  string.replaceAll("\\p{Punct}|\\n", "");
            writer.write(string);
        }
        reader.close();
        writer.close();

    }
}