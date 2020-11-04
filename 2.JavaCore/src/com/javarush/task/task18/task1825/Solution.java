package com.javarush.task.task18.task1825;

/*
Собираем файл
*/


import java.io.*;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        TreeSet<String> files = new TreeSet<>();
        while (!(fileName = reader.readLine()).equals("end")){
            files.add(fileName);
        }
        reader.close();
        String filesNameOfOut = files.first().substring(0,files.first().indexOf(".part"));
        //System.out.println(filesNameOfOut);
        FileOutputStream fos = new FileOutputStream(filesNameOfOut);

        for(String str : files){
            FileInputStream fis = new FileInputStream(str);
            byte [] buffer = new byte[fis.available()];
            fis.read(buffer);
            fos.write(buffer);
            fis.close();
        }
        fos.close();
    }

}