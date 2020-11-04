package com.javarush.task.task22.task2210;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] temp = getTokens("level22.lesson13.task01", ".");
        // System.out.println(temp.length);
    }

    public static String[] getTokens(String query, String delimiter) {

        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer =
                new StringTokenizer(query, delimiter);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            tokens.add(token);
            //две в одном   tokens.add(tokenizer.nextToken());
        }
        return tokens.toArray(new String[0]);
    }
}