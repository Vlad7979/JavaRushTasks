package com.javarush.task.task19.task1914;

/*
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();

        String result = outputStream.toString().trim();
        System.setOut(consoleStream);
        String [] calc = result.split(" ");
        if (calc[1].equals("+")) {
            result = result + " " + (Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]));
        }
        if (calc[1].equals("-")) {
            result = result + " " + (Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]));
        }
        if (calc[1].equals("*")) {
            result = result + " " + (Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]));
        }



        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}