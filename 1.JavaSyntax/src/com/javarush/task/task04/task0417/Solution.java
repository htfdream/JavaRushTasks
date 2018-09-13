package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

        if (a == b && b != c)
        System.out.println(a + " " + b);
        if (a == c && c != b)
        System.out.println(a + " " + c);
        if (b == c && a != b)
        System.out.println(b + " " + c);
        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
    }
}