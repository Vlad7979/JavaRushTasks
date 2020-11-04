package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);

        String babName = reader.readLine();
        Cat catBab = new Cat(babName);

        String papName = reader.readLine();
        Cat catPapa = new Cat(papName,null,catDed);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBab, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName,catMother,catPapa);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catPapa);

        System.out.println(catDed);
        System.out.println(catBab);
        System.out.println(catPapa);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat mother, Cat father){
            this.name=name;
            this.mother=mother;
            this.father=father;
        }

        @Override
        public String toString() {
            if ((mother == null)&& (father == null))
                return "The cat's name is " + name + ", no mother, no father";
            else if ((mother == null))
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "The cat's name is " + name + ", mother is "+mother.name+", no father";
            else
                return "The cat's name is "+name+ ", mother is "+mother.name+", father is "+father.name;
        }
    }

}