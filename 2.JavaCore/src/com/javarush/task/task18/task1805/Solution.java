package com.javarush.task.task18.task1805;

/*
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> set = new HashSet<>();

        FileInputStream file = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());
        while(file.available() > 0){
            set.add(file.read());
        }
        file.close();
        ArrayList<Integer> list = new ArrayList<>(set);

        //System.out.println(list.toString());

        Collections.sort(list);

        for (Integer num : list){
            System.out.print(num + " ");
        }


    }
}