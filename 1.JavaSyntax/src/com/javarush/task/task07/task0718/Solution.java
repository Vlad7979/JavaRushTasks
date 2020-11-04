package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<String> arrayList = new ArrayList<>();

         for (int i = 0; i < 10; i++) {
             arrayList.add(in.readLine());
         }

        for (int i = 0; i + 1 <= arrayList.size() - 1; i++) {
            if (arrayList.get(i).length() < arrayList.get(i + 1).length()) {
                continue;
            } else System.out.println(i + 1);
            break;
        }
    }
}

