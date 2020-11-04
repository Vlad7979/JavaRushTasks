package com.javarush.task.task19.task1920;

/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        while (reader.ready()){
            String[] line = reader.readLine().split(" ");
            map.merge(line[0],Double.valueOf(line[1]),Double::sum);
        }
        String string = "";
        Double max = 0.0;
        for (Map.Entry<String, Double> pair : map.entrySet()){
            if(pair.getValue() > max) max = pair.getValue();
        }
        for (Map.Entry<String, Double> pair : map.entrySet()){
            if(pair.getValue().equals(max)) string += pair.getKey() + " ";
        }
        System.out.println(string);
        reader.close();

    }
}