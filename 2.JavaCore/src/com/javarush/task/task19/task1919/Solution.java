package com.javarush.task.task19.task1919;

/*
Считаем зарплаты
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        String string;
        while ((string = reader.readLine()) != null){
            String[] people = string.split(" ");
            map.merge(people[0],Double.valueOf(people[1]), (oldVal, newVal) -> oldVal + newVal);
        }
        reader.close();
        for (Map.Entry<String,Double> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}