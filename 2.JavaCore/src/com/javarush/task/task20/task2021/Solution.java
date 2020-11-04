package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
    }

    public static void main(String[] args) {

    }

    private void writeObject(java.io.ObjectOutputStream out) throws NotSerializableException
    {
        throw new NotSerializableException("Нельзя сериализовать!");
    }

    private void readObject(java.io.ObjectInputStream in) throws NotSerializableException
    {
        throw new NotSerializableException("Нельзя сериализовать!");
    }

}