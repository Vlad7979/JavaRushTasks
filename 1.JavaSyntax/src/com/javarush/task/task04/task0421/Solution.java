package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s1 = in.readLine();
        String s2 = in.readLine();

        if (s1.equals(s2)) System.out.println("Имена идентичны");
        else if (s1.length() == s2.length()) System.out.println("Длины имен равны");
    }
}
