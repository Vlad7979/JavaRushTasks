package com.javarush.task.task19.task1927;

/*
Контекстная реклама
*/

import javax.xml.soap.SOAPElementFactory;
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
        String result = outputStream.toString();
        System.setOut(consoleStream);

        String [] words = result.split("\n");
        for (int i = 1; i < words.length; i = i + 2){
            System.out.println(words[i-1]);
            System.out.println(words[i]);
            System.out.println("JavaRush - курсы Java онлайн");
        }
        if (words.length%2 != 0){
            System.out.println(words[words.length - 1]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}