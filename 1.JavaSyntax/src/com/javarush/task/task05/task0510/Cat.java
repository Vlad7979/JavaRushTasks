package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;


    public void initialize(String name) {
        this.address = null;
        this.name = name;
        this.age = 7;
        this.weight = 23;
        this.color = "dsljgfhs";

    }
    public void initialize(String name, int age) {
        this.address = null;
        this.name = name;
        this.age = age;
        this.weight = 21;
        this.color = "Black";
    }
    public void initialize(String name, int weight, int age) {
        this.address = null;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }
    public void initialize(int weight, String color) {
        this.address = null;
        this.name = null;
        this.age = 7;
        this.weight = weight;
        this.color = color;

    }

    public void initialize(int weight, String color, String address) {
        this.address = address;
        this.name = null;
        this.age = 7;
        this.weight = weight;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}