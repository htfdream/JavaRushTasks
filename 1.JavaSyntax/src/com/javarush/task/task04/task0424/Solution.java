package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

        if (a == b && a != c)
            System.out.println(3);
        if (a == c && a !=b)
            System.out.println(2);
        if (a != b && b == c)
            System.out.println(1);
    }
}
