package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.BiConsumer;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return in.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(in.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(in.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(in.readLine());
    }

    public static void main(String[] args) throws Exception {

    }
}
