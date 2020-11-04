package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.List;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        // System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        // с символа после 1-го пробела и до конца слова, которое следует после 4-го пробела.

        try {
            ArrayList<String> list = new ArrayList<String>();
            for (String retval : string.split(" ")) {
                list.add(retval);
            }
            String resault;
            resault = list.get(1) + " " + list.get(2) + " " + list.get(3) + " " + list.get(4);
            return resault;
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}