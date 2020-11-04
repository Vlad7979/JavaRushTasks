package com.javarush.task.task18.task1821;

/*
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        int [] symbols = new int[256];
        while(reader.available()>0){
            symbols[reader.read()]++;
        }
        reader.close();
        for (int i = 0; i < 256; i++){
            if(symbols[i] != 0) {
                System.out.println((char) i + " " + symbols[i]);
            }
        }

    }
}