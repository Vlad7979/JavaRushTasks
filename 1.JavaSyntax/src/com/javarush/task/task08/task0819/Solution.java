package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution
{

    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. пункт 3
        //В методе main удалите одного кота из Set cats.
        cats.remove(cats.iterator().next());
        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        //2. Реализовать метод createCats, он должен
        // создавать множество (Set) котов и добавлять в него 3 кота.
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++)
        {
            cats.add(new Cat());

        }
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        //4. Реализовать метод printCats, он должен вывести на экран всех котов,
        // которые остались во множестве. Каждый кот с новой строки.
        for (Cat cat : cats){
            System.out.println(cat);
        }

    }

    // пункт 1
    //1. Внутри класса Solution создать public static класс кот – Cat.
    public static class Cat
    {

    }
}
