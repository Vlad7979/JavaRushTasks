package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Nina", 1, 3, 5);
        Cat cat2 = new Cat("Lera", 2, 4, 5);
        Cat cat3 = new Cat("Arsen", 4, 6, 7);

        if(cat1.fight(cat2))
        {
            System.out.println(cat1.name + " Just Kill " + cat2.name);
        }
        else
        {
            System.out.println(cat2.name + " Just Kill " + cat1.name);
        }
        if(cat1.fight(cat3))
        {
            System.out.println(cat1.name + " Just Kill " + cat3.name);
        }
        else
        {
            System.out.println(cat2.name + " Just Kill " + cat3.name);
        }
        if (cat2.fight(cat3))
        {
            System.out.println(cat2.name + " Just Kill " + cat3.name);
        }
        else
        {
            System.out.println(cat3.name + " Just Kill " + cat2.name);
        }
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
