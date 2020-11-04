package com.javarush.task.task06.task0606;

import java.io.*;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String txt = in.readLine();

        for (int i = 0; i < txt.length(); i++){
            int num = Integer.parseInt(String.valueOf(txt.charAt(i)));
            if (num % 2 == 0) {
                even++;
            }
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}