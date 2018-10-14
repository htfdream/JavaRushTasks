package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader(args[0]);
        BufferedReader buf = new BufferedReader(fr);

        while (buf.ready()){
            String s = buf.readLine();
            String name = s.replaceAll("\\s+\\d.*", "");
            String[] data = s.split(" ");
            String date = String.format("%02d%02d%d", Integer.parseInt(data[data.length-3]),Integer.parseInt(data[data.length-2]),Integer.parseInt(data[data.length-1]));

            SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
            PEOPLE.add(new Person(name, df.parse(date)));
        }
        buf.close();
        fr.close();


    }
}
