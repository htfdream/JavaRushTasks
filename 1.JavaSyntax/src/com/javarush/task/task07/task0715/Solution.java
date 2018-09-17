package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        Collections.addAll(arr, "мама", "мыла", "раму");
        arr.add(3,"именно");
        arr.add(2, "именно");
        arr.add(1, "именно");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }
    }
}
