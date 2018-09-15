package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

        if ((a > b && a < c)|| (a < b && a > c ) || (a == b && a != c))
            System.out.println(a);
        if ((b > a && b < c)|| (b < a && b > c) || (b == c && b != a ))
            System.out.println(b);
        if ((c > a && c < b) || (c < a && c > b) || (a == c ))
            System.out.println(c);
    }
}
