package com.javarush.task.task07.task0724;
/*
Семейная перепись
*/
public class Solution {
    public static void main(String[] args) {

        Human grendfather1 = new Human("Ваня", true, 95);
        Human grendmother1 = new Human("Валя", false, 95);
        Human grendfather2 = new Human("Коля", true, 95);
        Human grendmother2 = new Human("Марина", false, 95);
        Human father = new Human("Виталик", true, 50, grendfather1, grendmother1);
        Human mather = new Human("Оля", false, 50, grendfather2, grendmother2);
        Human sun1 = new Human("Женя", true, 15, father, mather);
        Human sun2 = new Human("Дима", true, 10, father, mather);
        Human daughters = new Human("катя", false, 5, father, mather);
        System.out.println(grendfather1);
        System.out.println(grendmother1);
        System.out.println(grendfather2);
        System.out.println(grendmother2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(sun1);
        System.out.println(sun2);
        System.out.println(daughters);

    }
    public static class Human {
        String name;//напишите тут ваш код
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}