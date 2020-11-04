package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);

        int positive = 0;
        int negative = 0;
        if (num1 > 0) {
            positive++;
        } else if (num1 < 0){
            negative++;
        }
        if (num2 > 0) {
            positive++;
        } else if (num2 < 0){
            negative++;
        }
        if (num3 > 0) {
            positive++;
        } else if (num3 < 0){
            negative++;
        }

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
