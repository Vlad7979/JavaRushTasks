package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));

        String file1 = fileName.readLine();
        String file2 = fileName.readLine();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        FileWriter writer = new FileWriter(file2);
        String [] list = reader.readLine().split(" ");
        reader.close();
        String str = "";
        for(String num : list){
            int x = (int) Math.round(Double.parseDouble(num));
            str = str + " " + x;
        }
        writer.write(str.trim());
        writer.close();
    }
}