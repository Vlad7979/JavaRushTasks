package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine()), b = Integer.parseInt(r.readLine()), c = Integer.parseInt(r.readLine());
        System.out.println(a == b && b == c || b != c && b == a || b != a && a == c || a > c && a < b || b < a && a < c? a : "");
        System.out.println(a != b && b == c || b > a && b < c || c < b && b < a ? b : "");
        System.out.println(c > a && c < b || b < c && c < a ? c : "");
    }
}
