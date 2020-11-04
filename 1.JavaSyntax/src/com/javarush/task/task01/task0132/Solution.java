package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int num_100 = number / 100;
        int num_10 = (number - num_100 * 100) / 10;
        int num_1 = (number - (num_100 * 100) - (num_10 * 10));
        int num = num_1 + num_10 + num_100;
        return num;
    }
}