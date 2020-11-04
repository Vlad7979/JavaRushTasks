package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            int first = string.indexOf("\t") + 1;
            String tmp = string.substring(first);
            int second = tmp.indexOf("\t") + first;
            return string.substring(first, second);
        } catch (Exception e) {
            throw new TooShortStringException();

        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}