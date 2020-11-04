package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {


    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Human boy = new Human("Boy", true, 16);
        Human girl1 = new Human("girl1", false, 17);
        Human girl2 = new Human("girl2", false, 12);
        ArrayList<Human> childs = new ArrayList<Human>();
        childs.add(boy);
        childs.add(girl1);
        childs.add(girl2);
        Human papa = new Human("Papa", true, 40, childs);
        ArrayList<Human> papan = new ArrayList<>();
        papan.add(papa);
        Human mama = new Human("Mama", false, 35, childs);
        ArrayList<Human> maman = new ArrayList<>();
        maman.add(mama);
        Human ded1 = new Human("ded1", true, 60, maman);
        Human babka1 = new Human("babka1", false, 58, maman);

        Human ded2 = new Human("ded2", true, 65, papan);
        Human babka2 = new Human("babka2", false, 65, papan);
        humans.add(boy);
        humans.add(girl1);
        humans.add(girl2);
        humans.add(papa);
        humans.add(mama);
        humans.add(ded1);
        humans.add(ded2);
        humans.add(babka1);
        humans.add(babka2);
        for (Human i : humans
        ) {
            System.out.println(i);
        }


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
