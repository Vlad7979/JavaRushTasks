package com.javarush.task.task18.task1819;

/*
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(fileName.readLine());
        File file2 = new File(fileName.readLine());
        FileInputStream reader = new FileInputStream(file1);
        byte [] buffer1 = new byte[reader.available()];
        reader.read(buffer1);
        reader.close();
        reader = new FileInputStream(file2);
        byte [] buffer2 = new byte[reader.available()];
        reader.read(buffer2);
        reader.close();
        FileOutputStream writer = new FileOutputStream(file1);
        writer.write(buffer2);
        writer.write(buffer1);
        writer.close();

    }
}