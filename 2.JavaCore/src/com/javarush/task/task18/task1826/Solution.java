package com.javarush.task.task18.task1826;

/*
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);
        int symbol;
        while(fis.available() > 0) {
            if (args[0].equals("-e")) {
                symbol = fis.read() + 1;
            }
            else{
                symbol = fis.read() - 1;
            }
            fos.write(symbol);
        }
        fis.close();
        fos.close();

    }

}