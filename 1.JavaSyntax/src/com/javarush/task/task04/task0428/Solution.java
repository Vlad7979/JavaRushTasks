package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ( a <= 0 && b <= 0 && c <= 0 ) {
            System.out.println(0);
        }
        else if ( a > 0 && b <= 0 && c <= 0 ) {
            System.out.println(1);
        }
        else if ( a <= 0 && b > 0 && c <= 0 ) {
            System.out.println(1);
        }
        else if ( a <= 0 && b <= 0 && c > 0 ) {
            System.out.println(1);
        }
        else if ( a > 0 && b > 0 && c <= 0 ) {
            System.out.println(2);
        }
        else if ( a <= 0 && b > 0 && c > 0 ) {
            System.out.println(2);
        }
        else if ( a > 0 && b <= 0 && c > 0 ) {
            System.out.println(2);
        }
        else if ( a > 0 && b > 0 && c > 0 ) {
            System.out.println(3);
        }

    }
}
