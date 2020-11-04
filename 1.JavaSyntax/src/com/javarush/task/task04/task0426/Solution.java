package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(in.readLine());
        if (num1 == 0) System.out.println("ноль");
        if ((num1 < 0) && !(num1 % 2 == 0)) System.out.println("отрицательное нечетное число");
        if ((num1 < 0) && (num1 % 2 == 0)) System.out.println("отрицательное четное число");
        if ((num1 > 0) && !(num1 % 2 == 0)) System.out.println("положительное нечетное число");
        if ((num1 > 0) && (num1 % 2 == 0)) System.out.println("положительное четное число");
    }
}
