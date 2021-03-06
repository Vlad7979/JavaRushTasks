package com.javarush.task.task19.task1923;

/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String s = "";
        while (reader.ready()){
            String[] strings = reader.readLine().split(" ");
            for (String x : strings){
                if (x.matches(".*[0-9]+.*")) s += x + " ";
            }
        }
        reader.close();
        writer.write(s);
        writer.close();
    }
}