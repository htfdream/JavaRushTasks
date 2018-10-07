package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.*;


/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            if (args[0].equals("-c")) {
                if (args[2].equals("м"))
                    allPeople.add(Person.createMale(args[1], f.parse(args[3])));
                else allPeople.add(Person.createFemale(args[1], f.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            } else if (args[0].equals("-u")) {
                Person p = allPeople.get(Integer.parseInt(args[1]));
                p.setName(args[2]);
                p.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                p.setBirthDay(f.parse(args[4]));


            } else if (args[0].equals("-d")) {
                Person p = allPeople.get(Integer.parseInt(args[1]));
                p.setName(null);
                p.setSex(null);
                p.setBirthDay(null);

            } else if (args[0].equals("-i")) {
                Person p = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(p.getName() + " " + (p.getSex().equals(Sex.MALE) ? "м" : "ж") + " " + String.format("%td-%1$tb-%1$tY", p.getBirthDay(), Locale.ENGLISH));

            }
        } catch (Exception e) {
        }
        /*for (Person p : allPeople
        ) {
            System.out.println(p.getName() + " " + (p.getSex().equals(Sex.MALE) ? "м" : "ж") + " " + String.format("%td-%1$tb-%1$tY", p.getBirthDay()));
        }*/
    }
}
