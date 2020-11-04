package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));
        //BufferedReader reader = new BufferedReader(new FileReader("c:/git/1.txt"));
        fileName.close();
        while(reader.ready()){
            String s = " " + reader.readLine() + " ";
            int count = 0;
            for (String x : words){
                x = " " + x + " ";
                if (s.contains(x)) count++;
            }
            if (count == 2) System.out.println(s.trim());
        }
        reader.close();

    }
}