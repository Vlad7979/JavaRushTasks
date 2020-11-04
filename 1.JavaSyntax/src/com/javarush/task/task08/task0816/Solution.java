package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() {
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Bazzini", new Date("JULY 24 1979"));
        map.put("Bill", new Date("AUGUST 19 2003"));
        map.put("Kate", new Date("SEPTEMBER 29 2017"));
        map.put("Kwark", new Date("FEBRUARY 29 1985"));
        map.put("Ludvic", new Date("MAY 14 1983"));
        map.put("Pozzi", new Date("DECEMBER 24 1999"));
        map.put("Barbossa", new Date("MARCH 13 1900"));
        map.put("Rokotta", new Date("NOVEMBER 10 1917"));
        map.put("Piculli", new Date("OCTOBER 13 1808"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Date> kv = iter.next();
            if (kv.getValue().getMonth() > 4 && kv.getValue().getMonth() < 8) {
                iter.remove();
            }
        }

    }

    public static void main(String[] args) {
    }
}