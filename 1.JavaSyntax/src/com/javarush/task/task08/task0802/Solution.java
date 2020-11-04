package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> collect = new HashMap<String, String>();
        collect.put("арбуз","ягода");
        collect.put("банан","трава");
        collect.put("вишня","ягода");
        collect.put("груша","фрукт");
        collect.put("дыня","овощ");
        collect.put("ежевика","куст");
        collect.put("жень-шень","корень");
        collect.put("земляника","ягода");
        collect.put("ирис","цветок");
        collect.put("картофель","клубень");

        for (Map.Entry<String, String> pair : collect.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
