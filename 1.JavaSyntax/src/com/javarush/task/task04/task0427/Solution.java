package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.sql.BatchUpdateException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());

        if (a % 2 == 0) {
            if (a >= 100 && a < 1000)
                System.out.println("четное трехзначное число");
            else if (a >= 10 && a < 100)
                System.out.println("четное двузначное число");
            else if (a > 0 && a < 10)
                System.out.println("четное однозначное число");
        }
        else {
            if (a >= 100 && a < 1000)
                System.out.println("нечетное трехзначное число");
            else if (a >= 10 && a < 100)
                System.out.println("нечетное двузначное число");
            else if (a > 0 && a < 10)
                System.out.println("нечетное однозначное число");
        }
    }

}

