package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(buf.readLine());
        if (a > 0)
            a = a * 2;
        if (a < 0)
            a = a + 1;
        System.out.println(a);


    }

}