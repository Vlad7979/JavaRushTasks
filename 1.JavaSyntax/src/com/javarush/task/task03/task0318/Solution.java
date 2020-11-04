package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(in.readLine());
        String string = in.readLine();
        System.out.println(string + " захватит мир через " + number + " лет. Му-ха-ха!");
    }
}
