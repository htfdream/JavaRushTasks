package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] arr = new String[10];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length-2; i++) {
            arr[i] = buf.readLine();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        }
    }
}