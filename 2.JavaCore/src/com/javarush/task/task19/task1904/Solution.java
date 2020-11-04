package com.javarush.task.task19.task1904;

/*
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;
        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String str =  fileScanner.nextLine();
            String[] string = str.split(" ",4);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);
            Date date = dateFormat.parse(string[3]);
            Person person = new Person(string[1],string[2],string[0],date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}