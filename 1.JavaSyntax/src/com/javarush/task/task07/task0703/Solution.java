package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrn = new int[10];
        String[] arrs = new String[10];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = buf.readLine();
            arrn[i] = arrs[i].length();
        }

        for (int i = 0; i < arrn.length; i++) {
            System.out.println(arrn[i]);
        }
    }
}
