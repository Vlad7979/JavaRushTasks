package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");

    }
}
