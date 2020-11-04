package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

        //test:
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        params.put("city2", "Kiev");
        System.out.println(getQuery(params));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder s2 = new StringBuilder();
        String result = "";
        if (params.isEmpty())
            return "";
        else {
            for (Map.Entry<String, String> pair : params.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();
                if (key == null) {
                    continue;
                } else if (value == null) {
                    continue;
                } else {
                    s2.append(key + " = '" + value + "' and ");
                }


            }

            if (s2.length() > 5) {
                s2.delete(s2.length() - 5, s2.length());
                result = s2.toString().trim();
            }
            return result;
        }
    }
}