package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //System.out.println(new Solution(4));
        //File yourFile = File.createTempFile("your_file_name", null);
        String yourFile="K:\\data1.txt";
        FileOutputStream outputStream = new FileOutputStream(yourFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Solution savedObject = new Solution(1);
        System.out.println(savedObject.string);
        objectOutputStream.writeObject(savedObject);

        FileInputStream inputStream = new FileInputStream(yourFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Solution loadedObject  = (Solution) objectInputStream.readObject();
        System.out.println(loadedObject.string);


        if (savedObject.toString().equals( loadedObject.toString() ))
            System.out.println("Ура!");
        else
            System.out.println("false");


    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}