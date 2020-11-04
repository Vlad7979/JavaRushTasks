package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    // 1
    static {
        init();
    }

    // 3
    static {
        System.out.println("Static block");
    }

    // 5
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    // 7
    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }


    // 4
    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    // 6, 8
    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }


    // 2
    public static void init() {
        System.out.println("static void init()");
    }
}
