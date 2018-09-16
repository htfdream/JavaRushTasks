package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        String date = new SimpleDateFormat("dd MM yyyy").format(new Date());

       System.out.println(date);
    }
}
