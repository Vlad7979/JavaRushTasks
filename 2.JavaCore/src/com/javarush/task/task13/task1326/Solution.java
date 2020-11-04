package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList<Integer> arrayList = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(Integer.parseInt(line));
        }
        fileInputStream.close();
        bufferedReader.close();
        Collections.sort(arrayList);
        for (Integer number : arrayList) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        fileInputStream.close();
    }
}
