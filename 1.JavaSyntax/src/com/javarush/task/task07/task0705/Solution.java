package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[20];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(buf.readLine());
        }

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr.length; i++) {
            if (i < 10)
                arr1[i] = arr[i];
            else
                arr2[i-10] = arr[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
