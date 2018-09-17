package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(buf.readLine());
        }
        int n = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (n < strings.get(i).length())
                n = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) {
            if ( n == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}
