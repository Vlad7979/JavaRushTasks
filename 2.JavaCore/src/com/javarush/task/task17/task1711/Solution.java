package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat printFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void createPeople(String name, String sex, String date) throws ParseException {
        Person person = null;
        if (sex.equals("м")){
            person = Person.createMale(name,format.parse(date));
        }
        if (sex.equals("ж")) {
            person = Person.createFemale(name,format.parse(date));
        }
        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }
    public static void setPeople(String id, String name, String sex, String date) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(name);
        person.setBirthDate(format.parse(date));
        person.setSex((sex == "м") ? Sex.MALE : Sex.FEMALE);

    }
    public static void dellPeople(String id) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(null);
        person.setBirthDate(null);
        person.setSex(null);
    }

    public static void printPeople(String id) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        String sex = person.getSex() == Sex.FEMALE ? "ж" : "м";
        System.out.println(person.getName() + " " + sex + " " + printFormat.format(person.getBirthDate()));
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]){
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        createPeople(args[i], args[i + 1], args[i + 2]);
                    }
                }
                break;
            case ("-u"):
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i+=4){
                        setPeople(args[i], args[i+1], args[i+2], args[i+3]);
                    }
                }
                break;
            case ("-d"):
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++){
                        dellPeople(args[i]);
                    }
                }
                break;
            case ("-i"):
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++){
                        printPeople(args[i]);
                    }
                }
                break;

        }

    }

}