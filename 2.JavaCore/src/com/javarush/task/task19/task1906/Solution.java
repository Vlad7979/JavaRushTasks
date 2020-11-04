package com.javarush.task.task19.task1906;

/*
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readerFileName = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(readerFileName.readLine());
        FileWriter writer = new FileWriter(readerFileName.readLine());
        readerFileName.close();
        int count = 0;
        while (reader.ready()){
            count++;
            int data = reader.read();
            if (count % 2 == 0){
                writer.write(data);
            }
        }
        reader.close();
        writer.close();
    }
}