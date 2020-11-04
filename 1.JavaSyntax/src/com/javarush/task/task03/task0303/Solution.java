package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(4, 2.15));
        System.out.println(convertEurToUsd(4, 2.16));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
