package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
            set.add(i);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            Integer a = i.next();
            if (a > 10)
                i.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());
    }
}