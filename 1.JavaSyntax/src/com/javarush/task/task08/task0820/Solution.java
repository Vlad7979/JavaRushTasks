package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<Cat>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());//напишите тут ваш код

        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());//напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set pets = new HashSet<>();
        for (int i = 0; i < (cats.size() + dogs.size()); i++) {
            pets.addAll(cats);
            pets.addAll(dogs);//напишите тут ваш код
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats); //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for(Object p : pets) {
            System.out.println(p);//напишите тут ваш код
        }
    }

    public static class Cat {}
    public static class Dog {}//напишите тут ваш код
}
