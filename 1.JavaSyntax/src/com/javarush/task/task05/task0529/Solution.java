package com.javarush.task.task05.task0529;

/*
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        int sum = 0;
        while(!s.equals("сумма")){
            int a = Integer.parseInt(s);
            sum += a;
            s = r.readLine();
        }
        System.out.println(sum);
    }
}