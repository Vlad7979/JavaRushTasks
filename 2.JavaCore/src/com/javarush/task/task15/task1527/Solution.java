package com.javarush.task.task15.task1527;

/*
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        /*
        add your code here
        http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
        http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
*/
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String link = reader.readLine();
            URL url = new URL(link);
            String query = url.getQuery();
            String[] query1 = query.split("&");
            ArrayList<String> arguments = new ArrayList<>();
            ArrayList<String> values = new ArrayList<>();

            for (String el: query1) {
                String arg = el.split("=")[0];
                String val = el.split("=").length > 1 ? el.split("=")[1] : null;
                arguments.add(arg);
                values.add(val);
                System.out.print(arg + " ");
            }

            System.out.println();
            for (int i = 0; i < arguments.size(); i++) {
                if (arguments.get(i).equals("obj")) {
                    if (isNumber(values.get(i))) {
                        alert(Double.parseDouble(values.get(i)));
                    } else {
                        alert(values.get(i));
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        int commaCount = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == '.' || c == ',') {
                commaCount++;
            }

            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-' && c != '.') // или не цифра и не начинается с '-' и не '.'
                    || (chars.length == 1 && c == '-') // или одиночный '-'
                    || (commaCount > 1))
            {
                return false;
            }
        }
        return true;
    }
}