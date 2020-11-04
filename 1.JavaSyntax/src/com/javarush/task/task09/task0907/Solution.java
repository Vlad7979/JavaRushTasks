package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }
    }
}
