package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;
        while (fileInputStream.available()>0){
            int x = fileInputStream.read();
            if ((x > 64 && x < 91)||(x > 96 && x < 123)){
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);

    }
}