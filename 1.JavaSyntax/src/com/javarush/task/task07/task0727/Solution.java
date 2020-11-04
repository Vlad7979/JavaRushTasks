package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0) {
                System.out.print(strings.get(i));
                System.out.print(" ");
                System.out.print(strings.get(i));
            }
            if (strings.get(i).length() % 2 == 1) {
                System.out.print(strings.get(i));
                System.out.print(" ");
                System.out.print(strings.get(i));
                System.out.print(" ");
                System.out.print(strings.get(i));
            }
            System.out.println();
        }
    }
}
