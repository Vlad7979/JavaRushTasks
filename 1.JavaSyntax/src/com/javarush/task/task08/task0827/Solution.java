package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("FEBRUARY 3 2013"));
    }

    public static boolean isDateOdd(String data) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(formatter.parse(data));
        int days = calendar.get(calendar.DAY_OF_YEAR);

        if (days % 2 != 0) {
            return true;
        } else {
            return false;

        }
    }
}