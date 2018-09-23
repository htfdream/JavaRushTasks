package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String name = buf.readLine();
        Month[] mn = Month.values();
        HashMap<Integer, String> ar = new HashMap<Integer, String>();
        int n = 0;
        for (int i = 0; i < 12; i++) {
           ar.put(i+1, mn[i].toString());
        }

        for (Map.Entry<Integer,String> pair : ar.entrySet()){
           if (pair.getValue().equals(name.toUpperCase()))
               n = pair.getKey();
        }

        System.out.println(name + " is the " + n + " month");
       // String name = buf.readLine().toUpperCase();
       // Date.
    }
}
