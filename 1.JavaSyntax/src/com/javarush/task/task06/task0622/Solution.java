package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            arr[i] = (Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j]=n;
                }

            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }
}
