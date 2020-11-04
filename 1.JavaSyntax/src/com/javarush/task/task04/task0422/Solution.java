package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        int age = Integer.parseInt(in.readLine());
        if (age < 18) System.out.println("Подрасти еще");
    }
}
