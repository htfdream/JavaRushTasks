package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[10];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(buf.readLine());

        }

        for (int i = 0; i < arr.length/2; i++) {

            int n = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

