package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    private static String multiplication(int s) {
        int a = 1, g = 1;
        String n = "";
        while (a < 11) {
            System.out.print(s * g + " ");
            a++;
            g++;
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        int a = 1, s = 1;
        while (a < 11) {
            System.out.println(multiplication(s++));
            a++;
        }
    }
}
