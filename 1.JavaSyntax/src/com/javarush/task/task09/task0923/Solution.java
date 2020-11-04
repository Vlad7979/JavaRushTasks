package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = reader.readLine().toCharArray();
        ArrayList<Character> listVow = new ArrayList<Character>();
        ArrayList<Character> listNVow = new ArrayList<Character>();
        for (int i = 0; i < chArr.length; i++) {
            if (isVowel(chArr[i])) {
                listVow.add(chArr[i]);
            } else if (chArr[i] == ' ') {
                continue;
            } else {
                listNVow.add(chArr[i]);
            }
        }
        for (char c : listVow) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : listNVow) {
            System.out.print(c + " ");
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}