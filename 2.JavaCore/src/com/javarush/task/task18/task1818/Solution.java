package com.javarush.task.task18.task1818;

/*
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileOutputStream file1 = new FileOutputStream((new BufferedReader(new InputStreamReader(System.in))).readLine(),true);
        FileInputStream file2 = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());
        FileInputStream file3 = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());

        byte [] buffer = new byte[file2.available()];
        file2.read(buffer);
        file1.write(buffer);
        file2.close();

        buffer = new byte[file3.available()];
        file3.read(buffer);
        file1.write(buffer);
        file3.close();
        file1.close();

    }
}