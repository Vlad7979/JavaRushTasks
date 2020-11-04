package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String y1 = reader.readLine();
        int y = Integer.parseInt(y1);
        String m1 = reader.readLine();
        int m = Integer.parseInt(m1);
        String d1 = reader.readLine();
        int d = Integer.parseInt(d1);


        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
