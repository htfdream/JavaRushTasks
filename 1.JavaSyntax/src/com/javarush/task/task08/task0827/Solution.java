package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("JANUARY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException{

        SimpleDateFormat df = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.ENGLISH);
        //LocalDate de = LocalDate.parse(date, df);
        Date ds = df.parse(date);
        Date de = df.parse(date);
        ds.setDate(01);
        ds.setMonth(0);
        ds.setHours(0);
        ds.setMinutes(0);
        ds.setSeconds(0);
        long n = (de.getTime() - ds.getTime())/ 1000/60/60/24 ;
        //System.out.println(n);
        return (n % 2 == 0);
    }
}
