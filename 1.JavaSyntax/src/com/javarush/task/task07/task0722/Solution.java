package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> m = new ArrayList<>();
        while (true) {
            m.add(reader.readLine());
            if (m.get(m.size() - 1).equals("end")) {
                m.remove(m.size() - 1);
                break;
            }
        }
        for (String x : m) {
            System.out.println(x);
        }
    }
}