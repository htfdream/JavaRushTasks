package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws Exception {
            String ln = fileScanner.next();
            String fn = fileScanner.next();
            String mn = fileScanner.next();
            String d = fileScanner.next();
            String m = fileScanner.next();
            String y = fileScanner.next();
            SimpleDateFormat fd = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
            Date db = fd.parse(d+m+y);
            Person person = new Person(fn, mn, ln, db);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
