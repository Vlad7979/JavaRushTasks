package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")){
            if (args[2].equals("м")) {
                Person person = Person.createMale(args[1], format.parse(args[3]));
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }

            if (args[2].equals("ж")){
                Person person = Person.createFemale(args[1],  format.parse(args[3]));
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        }
        if (args[0].equals("-u")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setBirthDate( format.parse(args[4]));
            if(args[3].equals("м")) person.setSex(Sex.MALE);
            if(args[3].equals("ж")) person.setSex(Sex.FEMALE);

        }
        if (args[0].equals("-d")){
            allPeople.set(Integer.parseInt(args[1]), Person.createFemale(null, null));
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
        }
        if (args[0].equals("-i")){
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String sex = (person.getSex() == Sex.MALE) ? "м" : "ж" ;
            System.out.println(person.getName() + " " + sex + " " + sdf.format(person.getBirthDate()));
        }
    }
}