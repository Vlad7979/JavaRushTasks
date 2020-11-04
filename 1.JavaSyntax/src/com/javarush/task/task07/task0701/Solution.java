package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] aa = new int[20];
        int l = aa.length;
        for (int i = 0; i < l; i++) {
            aa[i] = Integer.parseInt(r.readLine());
        }
        return aa;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int l = array.length, max = array[0];
        for (int i = 1; i < l; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}
