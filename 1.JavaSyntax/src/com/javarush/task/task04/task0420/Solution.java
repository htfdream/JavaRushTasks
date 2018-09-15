package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

        if (a>=b && a >= c) {

            if (b >= c )
                System.out.print(a + " "+ b + " " + c);
            else
                System.out.print(a + " " + c + " " + b);

        }
        else if (b>=a && b >= c) {

            if (c >= a )
                System.out.print(b + " " + c + " " + a);
            else
                System.out.print(b + " " + a + " " + c);

        }
        else if (c >=b && a <= c) {

            if (b >= a )
                System.out.print(c + " "+ b + " " + a);
            else
                System.out.print(c + " " + a + " " + b);

        }

    }
}
