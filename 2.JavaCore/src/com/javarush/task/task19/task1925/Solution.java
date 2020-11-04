package com.javarush.task.task19.task1925;

/*
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String string = "";

        while (reader.ready()){
            String[] s = reader.readLine().split(" ");
            for (String x : s){
                if (x.length() > 6) string += x + ",";
            }
        }
        reader.close();
        string = string.substring(0, string.length() - 1);
        writer.write(string);
        writer.close();
    }
}