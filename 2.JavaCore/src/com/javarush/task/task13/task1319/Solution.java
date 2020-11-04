package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.LinkedList;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        LinkedList<String> linkedList = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(bufferedReader.readLine());
        while (true) {
            String currentString = bufferedReader.readLine();
            linkedList.add(currentString);
            if (currentString.trim().equals("exit")) {
                break;
            }
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String string : linkedList) {
            bufferedWriter.write(string + "\n");
        }
        bufferedReader.close();
        bufferedWriter.close();


    }
}