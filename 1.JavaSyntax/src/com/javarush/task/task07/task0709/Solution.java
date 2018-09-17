package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(buf.readLine());
        }
        int n = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (n > strings.get(i).length())
                n = strings.get(i).length();
        }
        for (int i = 0; i < strings.size(); i++) {
            if ( n == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}
