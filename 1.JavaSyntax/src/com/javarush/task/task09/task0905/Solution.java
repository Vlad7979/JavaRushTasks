package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        int number = 0;
        for (StackTraceElement elements : trace){
            number++;
        }
        System.out.println(number);
        return number;
    }
}
