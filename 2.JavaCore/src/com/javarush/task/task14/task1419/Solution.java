package com.javarush.task.task14.task1419;

import java.awt.print.PrinterException;
import java.nio.ReadOnlyBufferException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new NullPointerException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new SQLSyntaxErrorException());
        exceptions.add(new DataFormatException());
        exceptions.add(new FormatterClosedException());
        exceptions.add(new ReadOnlyBufferException());
        exceptions.add(new PrinterException());

        //напишите тут ваш код

    }
}
