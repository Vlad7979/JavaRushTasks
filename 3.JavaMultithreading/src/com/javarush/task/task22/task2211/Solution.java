package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/*
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length == 2) {
            Charset utf8 = Charset.forName("UTF-8");
            Charset windows1251 = Charset.forName("Windows-1251");

            String f1 = args[0];
            String f2 = args[1];
            //String f1 = "C:\\work\\1.txt";
            //String f2 = "C:\\work\\2.txt";
            FileInputStream inputStream = new FileInputStream(f1);
            FileOutputStream outputStream = new FileOutputStream(f2);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            String s = new String(buffer, windows1251);
            buffer = s.getBytes(utf8);
            outputStream.write(buffer);
        }

    }
}