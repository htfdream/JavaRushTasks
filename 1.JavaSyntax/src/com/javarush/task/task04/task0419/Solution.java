package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import org.omg.PortableInterceptor.INACTIVE;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());
        int d = Integer.parseInt(buf.readLine());
        int res;
        int res1;

            if (a >= b)
                res = a;
            else
                    res = b;
        if (c >= d)
            res1 = c;
        else
            res1 = d;

        if (res >= res1)
            System.out.println(res);
        else
            System.out.println(res1);

    }
}
