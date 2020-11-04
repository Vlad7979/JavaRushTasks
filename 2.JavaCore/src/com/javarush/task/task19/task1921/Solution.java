package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String string = reader.readLine();
                String name = string.replaceAll("[0-9]","").trim();
                Date date = dateFormat.parse(string.replaceAll("[^0-9]", " ").trim());
                PEOPLE.add(new Person(name, date));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}