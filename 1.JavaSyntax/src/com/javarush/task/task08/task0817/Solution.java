package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> hMap = new HashMap<String,String>();
        hMap.put("Савинов0","Никита1");
        hMap.put("Савинов1","Никита7");
        hMap.put("Савинов2","Никита6");
        hMap.put("Савинов3","Никита6");
        hMap.put("Савинов4","Никита5");
        hMap.put("Савинов5","Никита4");
        hMap.put("Савинов6","Никита3");
        hMap.put("Савинов7","Никита2");
        hMap.put("Савинов8","Никита2");
        hMap.put("Савинов9","Никита1");
        return hMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> copy = new HashMap<String,String>(map);

        for (Map.Entry<String,String> pair:copy.entrySet()) {
            String value = pair.getValue();
            int k = 0;
            for (Map.Entry<String, String> tPair : copy.entrySet()) {
                if (value == tPair.getValue()) k++;
            }
            if (k>1) removeItemFromMapByValue(map, value);

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String,String> copy = new HashMap<String,String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
