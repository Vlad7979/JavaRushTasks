package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        String a = "8", b = "8";
        for (; true; ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(a);
                a = a.concat(b);
            }
            break;
        }
    }
}
