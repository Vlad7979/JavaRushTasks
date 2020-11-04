package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

import java.util.Scanner;

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append(s);
        }
        return result.toString();
    }

    public static String multiply(String s, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++){
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        multiply("srg", 5);
    }
}
