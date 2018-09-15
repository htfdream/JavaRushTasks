package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int p = 0;
        int n = 0;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(buf.readLine());
            if (a > 0)
                p ++;
            else if (a < 0)
                n ++;
        }
        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + p);
    }
}
