package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        int i = 0;

        if (maximum > 0) {
            for (int m = 1; m <= maximum; m++) {
                int b = Integer.parseInt(reader.readLine());
                if (m == 1) i = b;
                if (b > i) i = b;
            }
            System.out.println(i);
        }
    }
}
