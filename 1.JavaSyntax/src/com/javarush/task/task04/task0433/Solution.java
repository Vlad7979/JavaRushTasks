package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    private static String whileCycle(String s){
        int a = 1;
        while (a < 10) {
            System.out.print(s);
            a++;
        }return s;
    }
    public static void main(String[] args) throws Exception {
        int a = 1;
        while(a < 11) {
            System.out.println(whileCycle("S"));
            a++;
        }
    }
}
