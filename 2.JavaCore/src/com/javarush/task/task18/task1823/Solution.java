package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!((fileName = reader.readLine()).equals("exit"))){
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        private int max;
        private int countByte;

        public ReadThread(String fileName) throws IOException {
            try (FileInputStream reader = new FileInputStream(fileName)){
                int [] array = new int[256];
                while (reader.available() > 0) array[reader.read()]++;
                for (int i = 0; i < 256; i++){
                    if(array[i] > max) {
                        max = array[i];
                        countByte = i;
                    }
                }

                resultMap.put(fileName, countByte);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}