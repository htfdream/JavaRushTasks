package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i]= (Integer.parseInt(reader.readLine()));
        }
        maximum = arr[0];
        minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i])
                maximum = arr[i];
            if (minimum > arr[i])
                minimum = arr[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
