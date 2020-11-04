package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int score = 0;
        if (this.age > anotherCat.age) {
            score++;
        } else if (this.age < anotherCat.age) {
            score--;
        }
        if (this.weight > anotherCat.weight) {
            score++;
        } else if (this.weight < anotherCat.weight) {
            score--;
        }
        if (this.strength > anotherCat.strength) {
            score++;
        } else if (this.strength < anotherCat.strength) {
            score--;
        }
        return score > 0;
    }

    public static void main(String[] args) {

    }
}
