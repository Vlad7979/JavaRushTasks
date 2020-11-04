package com.javarush.task.task18.task1803;

/*
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap();
        FileInputStream file = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());

        while (file.available() > 0){
            Integer key = file.read();
            Integer count = map.get(key);
            map.put(key,(count == null) ? 1 : count + 1);
        }
        file.close();

        //System.out.println(map.toString());
        int maxValue = 1;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (maxValue < pair.getValue()) maxValue = pair.getValue();
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (maxValue == pair.getValue()) System.out.print(pair.getKey()+ " ");
        }
    }
}